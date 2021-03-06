/*
 * Copyright (c) 2016, GoMint, BlackyPaw and geNAZt
 *
 * This code is licensed under the BSD license found in the
 * LICENSE file in the root directory of this source tree.
 */

package io.gomint.proxprox.api.event;

import io.gomint.proxprox.api.entity.Player;
import io.gomint.proxprox.api.plugin.event.CancelableEvent;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author geNAZt
 * @version 1.0
 */
@RequiredArgsConstructor
@Getter
public class PlayerLoginEvent extends CancelableEvent {

    private final Player player;
    private String disconnectReason;

    public void deny( String reason ) {
        this.setCancelled( true );
        this.disconnectReason = reason;
    }

}
