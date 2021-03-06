/*
 * (C) Copyright 2018 The DKBans Project (Davide Wietlisbach)
 *
 * @author Davide Wietlisbach
 * @since 31.12.18 11:39
 * @Website https://github.com/DevKrieger/DKBans
 *
 * The DKBans Project is under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package ch.dkrieger.bansystem.extension.reportconnect;

import ch.dkrieger.bansystem.lib.BanSystem;

import java.util.Arrays;
import java.util.List;

public class DKBansReportConnectConfig {

    public String message;
    public List<String> commadnsOnConnect;

    public DKBansReportConnectConfig() {
        message = BanSystem.getInstance().getMessageConfig().addAndGetMessageValue("extension.reportconnect","[prefix]&8[player] &7switched server, connecting...");
        BanSystem.getInstance().getMessageConfig().save();

        commadnsOnConnect = BanSystem.getInstance().getConfig().addAndGetStringListValue("extension.reportconnect.commands", Arrays.asList());
        BanSystem.getInstance().getConfig().save();
    }
}
