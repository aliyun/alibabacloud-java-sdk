// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ModifyInstanceStorageConfigRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, which ensures that the request is not repeated.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of storage configurations.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<ModifyInstanceStorageConfigRequestConfigList> configList;

    /**
     * <p>The instance ID of the AI application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyInstanceStorageConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceStorageConfigRequest self = new ModifyInstanceStorageConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceStorageConfigRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public ModifyInstanceStorageConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyInstanceStorageConfigRequest setConfigList(java.util.List<ModifyInstanceStorageConfigRequestConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<ModifyInstanceStorageConfigRequestConfigList> getConfigList() {
        return this.configList;
    }

    public ModifyInstanceStorageConfigRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ModifyInstanceStorageConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class ModifyInstanceStorageConfigRequestConfigList extends TeaModel {
        /**
         * <p>The name of the configuration item. Valid values:</p>
         * <ul>
         * <li><strong>AWS_SESSION_TOKEN</strong> (optional): the temporary access token (Session Token) for OSS. If this parameter is not specified, AccessKey ID and AccessKey Secret are used for authentication.</li>
         * <li><strong>AWS_ACCESS_KEY_ID</strong>: the AccessKey ID for OSS.</li>
         * <li><strong>AWS_SECRET_ACCESS_KEY</strong>: the AccessKey Secret for OSS.</li>
         * <li><strong>GLOBAL_S3_BUCKET</strong>: the bucket name of OSS.</li>
         * <li><strong>TENANT_ID</strong>: the OSS directory name. You do not need to create it in advance.</li>
         * <li><strong>GLOBAL_S3_ENDPOINT</strong>: the endpoint of OSS.</li>
         * <li><strong>REGION</strong>: the region of OSS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TENANT_ID</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>test-prefix</p>
         */
        @NameInMap("Value")
        public String value;

        public static ModifyInstanceStorageConfigRequestConfigList build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceStorageConfigRequestConfigList self = new ModifyInstanceStorageConfigRequestConfigList();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceStorageConfigRequestConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyInstanceStorageConfigRequestConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
