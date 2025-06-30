// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpgradeVersionRequest extends TeaModel {
    @NameInMap("FastMode")
    public Boolean fastMode;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether the minor version is upgraded. Default value: true. Valid values:</p>
     * <ul>
     * <li>true: The minor version is upgraded.</li>
     * <li>false: The major version is upgraded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Minor")
    public Boolean minor;

    /**
     * <p>The version to which you want to upgrade.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3.3.2-1.77-1.6.4</p>
     */
    @NameInMap("TargetVersion")
    public String targetVersion;

    public static UpgradeVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeVersionRequest self = new UpgradeVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeVersionRequest setFastMode(Boolean fastMode) {
        this.fastMode = fastMode;
        return this;
    }
    public Boolean getFastMode() {
        return this.fastMode;
    }

    public UpgradeVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpgradeVersionRequest setMinor(Boolean minor) {
        this.minor = minor;
        return this;
    }
    public Boolean getMinor() {
        return this.minor;
    }

    public UpgradeVersionRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

}
