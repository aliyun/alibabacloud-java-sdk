// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class UpdateTerminalPolicyRequest extends TeaModel {
    @NameInMap("AllowManualLockScreen")
    public Integer allowManualLockScreen;

    @NameInMap("BackgroundModeTitle")
    public String backgroundModeTitle;

    @NameInMap("CustomScreenCastRes")
    public Boolean customScreenCastRes;

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

    @NameInMap("EnableControlPanel")
    public Integer enableControlPanel;

    @NameInMap("EnableImmersiveMode")
    public Integer enableImmersiveMode;

    @NameInMap("EnableLockScreenHotKey")
    public Integer enableLockScreenHotKey;

    @NameInMap("EnableModifyPassword")
    public Integer enableModifyPassword;

    @NameInMap("EnableScanLogin")
    public Integer enableScanLogin;

    @NameInMap("EnableScheduledReboot")
    public Integer enableScheduledReboot;

    @NameInMap("EnableScheduledShutdown")
    public Integer enableScheduledShutdown;

    @NameInMap("EnableSmsLogin")
    public Integer enableSmsLogin;

    @NameInMap("EnableSwitchPersonal")
    public Integer enableSwitchPersonal;

    @NameInMap("EnableWlan")
    public Integer enableWlan;

    @NameInMap("FollowCloudReboot")
    public Integer followCloudReboot;

    @NameInMap("FollowCloudShutdown")
    public Integer followCloudShutdown;

    @NameInMap("FollowTerminalReboot")
    public Integer followTerminalReboot;

    @NameInMap("FollowTerminalShutdown")
    public Integer followTerminalShutdown;

    @NameInMap("ForceSetPinCode")
    public Integer forceSetPinCode;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("IdleTimeoutAction")
    public Integer idleTimeoutAction;

    @NameInMap("LockScreenPasswordRequired")
    public Integer lockScreenPasswordRequired;

    @NameInMap("LockScreenTimeout")
    public Integer lockScreenTimeout;

    @NameInMap("MainBizType")
    public String mainBizType;

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

    @NameInMap("RunningMode")
    public String runningMode;

    @NameInMap("ScheduledReboot")
    public String scheduledReboot;

    @NameInMap("ScheduledShutdown")
    public String scheduledShutdown;

    @NameInMap("ScreenCastResPaths")
    public java.util.List<String> screenCastResPaths;

    @NameInMap("SettingLock")
    public Integer settingLock;

    @NameInMap("TerminalPolicyId")
    public String terminalPolicyId;

    @NameInMap("UnlockMethod")
    public Integer unlockMethod;

    public static UpdateTerminalPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTerminalPolicyRequest self = new UpdateTerminalPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTerminalPolicyRequest setAllowManualLockScreen(Integer allowManualLockScreen) {
        this.allowManualLockScreen = allowManualLockScreen;
        return this;
    }
    public Integer getAllowManualLockScreen() {
        return this.allowManualLockScreen;
    }

    public UpdateTerminalPolicyRequest setBackgroundModeTitle(String backgroundModeTitle) {
        this.backgroundModeTitle = backgroundModeTitle;
        return this;
    }
    public String getBackgroundModeTitle() {
        return this.backgroundModeTitle;
    }

    public UpdateTerminalPolicyRequest setCustomScreenCastRes(Boolean customScreenCastRes) {
        this.customScreenCastRes = customScreenCastRes;
        return this;
    }
    public Boolean getCustomScreenCastRes() {
        return this.customScreenCastRes;
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

    public UpdateTerminalPolicyRequest setEnableControlPanel(Integer enableControlPanel) {
        this.enableControlPanel = enableControlPanel;
        return this;
    }
    public Integer getEnableControlPanel() {
        return this.enableControlPanel;
    }

    public UpdateTerminalPolicyRequest setEnableImmersiveMode(Integer enableImmersiveMode) {
        this.enableImmersiveMode = enableImmersiveMode;
        return this;
    }
    public Integer getEnableImmersiveMode() {
        return this.enableImmersiveMode;
    }

    public UpdateTerminalPolicyRequest setEnableLockScreenHotKey(Integer enableLockScreenHotKey) {
        this.enableLockScreenHotKey = enableLockScreenHotKey;
        return this;
    }
    public Integer getEnableLockScreenHotKey() {
        return this.enableLockScreenHotKey;
    }

    public UpdateTerminalPolicyRequest setEnableModifyPassword(Integer enableModifyPassword) {
        this.enableModifyPassword = enableModifyPassword;
        return this;
    }
    public Integer getEnableModifyPassword() {
        return this.enableModifyPassword;
    }

    public UpdateTerminalPolicyRequest setEnableScanLogin(Integer enableScanLogin) {
        this.enableScanLogin = enableScanLogin;
        return this;
    }
    public Integer getEnableScanLogin() {
        return this.enableScanLogin;
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

    public UpdateTerminalPolicyRequest setEnableSmsLogin(Integer enableSmsLogin) {
        this.enableSmsLogin = enableSmsLogin;
        return this;
    }
    public Integer getEnableSmsLogin() {
        return this.enableSmsLogin;
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

    public UpdateTerminalPolicyRequest setFollowCloudReboot(Integer followCloudReboot) {
        this.followCloudReboot = followCloudReboot;
        return this;
    }
    public Integer getFollowCloudReboot() {
        return this.followCloudReboot;
    }

    public UpdateTerminalPolicyRequest setFollowCloudShutdown(Integer followCloudShutdown) {
        this.followCloudShutdown = followCloudShutdown;
        return this;
    }
    public Integer getFollowCloudShutdown() {
        return this.followCloudShutdown;
    }

    public UpdateTerminalPolicyRequest setFollowTerminalReboot(Integer followTerminalReboot) {
        this.followTerminalReboot = followTerminalReboot;
        return this;
    }
    public Integer getFollowTerminalReboot() {
        return this.followTerminalReboot;
    }

    public UpdateTerminalPolicyRequest setFollowTerminalShutdown(Integer followTerminalShutdown) {
        this.followTerminalShutdown = followTerminalShutdown;
        return this;
    }
    public Integer getFollowTerminalShutdown() {
        return this.followTerminalShutdown;
    }

    public UpdateTerminalPolicyRequest setForceSetPinCode(Integer forceSetPinCode) {
        this.forceSetPinCode = forceSetPinCode;
        return this;
    }
    public Integer getForceSetPinCode() {
        return this.forceSetPinCode;
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

    public UpdateTerminalPolicyRequest setLockScreenPasswordRequired(Integer lockScreenPasswordRequired) {
        this.lockScreenPasswordRequired = lockScreenPasswordRequired;
        return this;
    }
    public Integer getLockScreenPasswordRequired() {
        return this.lockScreenPasswordRequired;
    }

    public UpdateTerminalPolicyRequest setLockScreenTimeout(Integer lockScreenTimeout) {
        this.lockScreenTimeout = lockScreenTimeout;
        return this;
    }
    public Integer getLockScreenTimeout() {
        return this.lockScreenTimeout;
    }

    public UpdateTerminalPolicyRequest setMainBizType(String mainBizType) {
        this.mainBizType = mainBizType;
        return this;
    }
    public String getMainBizType() {
        return this.mainBizType;
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

    public UpdateTerminalPolicyRequest setRunningMode(String runningMode) {
        this.runningMode = runningMode;
        return this;
    }
    public String getRunningMode() {
        return this.runningMode;
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

    public UpdateTerminalPolicyRequest setScreenCastResPaths(java.util.List<String> screenCastResPaths) {
        this.screenCastResPaths = screenCastResPaths;
        return this;
    }
    public java.util.List<String> getScreenCastResPaths() {
        return this.screenCastResPaths;
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

    public UpdateTerminalPolicyRequest setUnlockMethod(Integer unlockMethod) {
        this.unlockMethod = unlockMethod;
        return this;
    }
    public Integer getUnlockMethod() {
        return this.unlockMethod;
    }

}
