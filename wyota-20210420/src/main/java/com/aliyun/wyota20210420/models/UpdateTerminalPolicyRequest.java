// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateTerminalPolicyRequest extends TeaModel {
    @NameInMap("BackgroundModeTitle")
    public String backgroundModeTitle;

    @NameInMap("DisplayLayout")
    public String displayLayout;

    @NameInMap("DisplayResolution")
    public String displayResolution;

    @NameInMap("DisplayScaleRatio")
    public String displayScaleRatio;

    @NameInMap("EnableAutoLockScreen")
    public Integer enableAutoLockScreen;

    @NameInMap("EnableAutoLogin")
    public Integer enableAutoLogin;

    @NameInMap("EnableBackgroundMode")
    public Integer enableBackgroundMode;

    @NameInMap("EnableBluetooth")
    public Integer enableBluetooth;

    @NameInMap("EnableModifyPassword")
    public Integer enableModifyPassword;

    @NameInMap("EnableScheduledReboot")
    public Integer enableScheduledReboot;

    @NameInMap("EnableScheduledShutdown")
    public Integer enableScheduledShutdown;

    @NameInMap("EnableSwitchPersonal")
    public Integer enableSwitchPersonal;

    @NameInMap("EnableWlan")
    public Integer enableWlan;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("IdleTimeoutAction")
    public Integer idleTimeoutAction;

    @NameInMap("Name")
    public String name;

    @NameInMap("PowerButtonDefine")
    public Integer powerButtonDefine;

    @NameInMap("PowerButtonDefineForAs")
    public Integer powerButtonDefineForAs;

    @NameInMap("PowerButtonDefineForNs")
    public Integer powerButtonDefineForNs;

    @NameInMap("PowerOnBehavior")
    public Integer powerOnBehavior;

    @NameInMap("ScheduledReboot")
    public String scheduledReboot;

    @NameInMap("ScheduledShutdown")
    public String scheduledShutdown;

    @NameInMap("SettingLock")
    public Integer settingLock;

    @NameInMap("TerminalPolicyId")
    public String terminalPolicyId;

    public static UpdateTerminalPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTerminalPolicyRequest self = new UpdateTerminalPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTerminalPolicyRequest setBackgroundModeTitle(String backgroundModeTitle) {
        this.backgroundModeTitle = backgroundModeTitle;
        return this;
    }
    public String getBackgroundModeTitle() {
        return this.backgroundModeTitle;
    }

    public UpdateTerminalPolicyRequest setDisplayLayout(String displayLayout) {
        this.displayLayout = displayLayout;
        return this;
    }
    public String getDisplayLayout() {
        return this.displayLayout;
    }

    public UpdateTerminalPolicyRequest setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
        return this;
    }
    public String getDisplayResolution() {
        return this.displayResolution;
    }

    public UpdateTerminalPolicyRequest setDisplayScaleRatio(String displayScaleRatio) {
        this.displayScaleRatio = displayScaleRatio;
        return this;
    }
    public String getDisplayScaleRatio() {
        return this.displayScaleRatio;
    }

    public UpdateTerminalPolicyRequest setEnableAutoLockScreen(Integer enableAutoLockScreen) {
        this.enableAutoLockScreen = enableAutoLockScreen;
        return this;
    }
    public Integer getEnableAutoLockScreen() {
        return this.enableAutoLockScreen;
    }

    public UpdateTerminalPolicyRequest setEnableAutoLogin(Integer enableAutoLogin) {
        this.enableAutoLogin = enableAutoLogin;
        return this;
    }
    public Integer getEnableAutoLogin() {
        return this.enableAutoLogin;
    }

    public UpdateTerminalPolicyRequest setEnableBackgroundMode(Integer enableBackgroundMode) {
        this.enableBackgroundMode = enableBackgroundMode;
        return this;
    }
    public Integer getEnableBackgroundMode() {
        return this.enableBackgroundMode;
    }

    public UpdateTerminalPolicyRequest setEnableBluetooth(Integer enableBluetooth) {
        this.enableBluetooth = enableBluetooth;
        return this;
    }
    public Integer getEnableBluetooth() {
        return this.enableBluetooth;
    }

    public UpdateTerminalPolicyRequest setEnableModifyPassword(Integer enableModifyPassword) {
        this.enableModifyPassword = enableModifyPassword;
        return this;
    }
    public Integer getEnableModifyPassword() {
        return this.enableModifyPassword;
    }

    public UpdateTerminalPolicyRequest setEnableScheduledReboot(Integer enableScheduledReboot) {
        this.enableScheduledReboot = enableScheduledReboot;
        return this;
    }
    public Integer getEnableScheduledReboot() {
        return this.enableScheduledReboot;
    }

    public UpdateTerminalPolicyRequest setEnableScheduledShutdown(Integer enableScheduledShutdown) {
        this.enableScheduledShutdown = enableScheduledShutdown;
        return this;
    }
    public Integer getEnableScheduledShutdown() {
        return this.enableScheduledShutdown;
    }

    public UpdateTerminalPolicyRequest setEnableSwitchPersonal(Integer enableSwitchPersonal) {
        this.enableSwitchPersonal = enableSwitchPersonal;
        return this;
    }
    public Integer getEnableSwitchPersonal() {
        return this.enableSwitchPersonal;
    }

    public UpdateTerminalPolicyRequest setEnableWlan(Integer enableWlan) {
        this.enableWlan = enableWlan;
        return this;
    }
    public Integer getEnableWlan() {
        return this.enableWlan;
    }

    public UpdateTerminalPolicyRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public UpdateTerminalPolicyRequest setIdleTimeoutAction(Integer idleTimeoutAction) {
        this.idleTimeoutAction = idleTimeoutAction;
        return this;
    }
    public Integer getIdleTimeoutAction() {
        return this.idleTimeoutAction;
    }

    public UpdateTerminalPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTerminalPolicyRequest setPowerButtonDefine(Integer powerButtonDefine) {
        this.powerButtonDefine = powerButtonDefine;
        return this;
    }
    public Integer getPowerButtonDefine() {
        return this.powerButtonDefine;
    }

    public UpdateTerminalPolicyRequest setPowerButtonDefineForAs(Integer powerButtonDefineForAs) {
        this.powerButtonDefineForAs = powerButtonDefineForAs;
        return this;
    }
    public Integer getPowerButtonDefineForAs() {
        return this.powerButtonDefineForAs;
    }

    public UpdateTerminalPolicyRequest setPowerButtonDefineForNs(Integer powerButtonDefineForNs) {
        this.powerButtonDefineForNs = powerButtonDefineForNs;
        return this;
    }
    public Integer getPowerButtonDefineForNs() {
        return this.powerButtonDefineForNs;
    }

    public UpdateTerminalPolicyRequest setPowerOnBehavior(Integer powerOnBehavior) {
        this.powerOnBehavior = powerOnBehavior;
        return this;
    }
    public Integer getPowerOnBehavior() {
        return this.powerOnBehavior;
    }

    public UpdateTerminalPolicyRequest setScheduledReboot(String scheduledReboot) {
        this.scheduledReboot = scheduledReboot;
        return this;
    }
    public String getScheduledReboot() {
        return this.scheduledReboot;
    }

    public UpdateTerminalPolicyRequest setScheduledShutdown(String scheduledShutdown) {
        this.scheduledShutdown = scheduledShutdown;
        return this;
    }
    public String getScheduledShutdown() {
        return this.scheduledShutdown;
    }

    public UpdateTerminalPolicyRequest setSettingLock(Integer settingLock) {
        this.settingLock = settingLock;
        return this;
    }
    public Integer getSettingLock() {
        return this.settingLock;
    }

    public UpdateTerminalPolicyRequest setTerminalPolicyId(String terminalPolicyId) {
        this.terminalPolicyId = terminalPolicyId;
        return this;
    }
    public String getTerminalPolicyId() {
        return this.terminalPolicyId;
    }

}
