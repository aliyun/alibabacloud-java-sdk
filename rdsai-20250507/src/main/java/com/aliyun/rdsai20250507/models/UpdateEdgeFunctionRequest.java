// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class UpdateEdgeFunctionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Code")
    public UpdateEdgeFunctionRequestCode code;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("CustomConfig")
    public java.util.Map<String, ?> customConfig;

    /**
     * <p>fc-xxxx。</p>
     * 
     * <strong>example:</strong>
     * <p>ef-****</p>
     */
    @NameInMap("EdgeFunctionName")
    public String edgeFunctionName;

    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateEdgeFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeFunctionRequest self = new UpdateEdgeFunctionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeFunctionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateEdgeFunctionRequest setCode(UpdateEdgeFunctionRequestCode code) {
        this.code = code;
        return this;
    }
    public UpdateEdgeFunctionRequestCode getCode() {
        return this.code;
    }

    public UpdateEdgeFunctionRequest setCustomConfig(java.util.Map<String, ?> customConfig) {
        this.customConfig = customConfig;
        return this;
    }
    public java.util.Map<String, ?> getCustomConfig() {
        return this.customConfig;
    }

    public UpdateEdgeFunctionRequest setEdgeFunctionName(String edgeFunctionName) {
        this.edgeFunctionName = edgeFunctionName;
        return this;
    }
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
    }

    public UpdateEdgeFunctionRequest setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public UpdateEdgeFunctionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateEdgeFunctionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateEdgeFunctionRequestCode extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <strong>example:</strong>
         * <p>example2.zip</p>
         */
        @NameInMap("OssObjectName")
        public String ossObjectName;

        /**
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("OssType")
        public String ossType;

        public static UpdateEdgeFunctionRequestCode build(java.util.Map<String, ?> map) throws Exception {
            UpdateEdgeFunctionRequestCode self = new UpdateEdgeFunctionRequestCode();
            return TeaModel.build(map, self);
        }

        public UpdateEdgeFunctionRequestCode setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public UpdateEdgeFunctionRequestCode setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public UpdateEdgeFunctionRequestCode setOssType(String ossType) {
            this.ossType = ossType;
            return this;
        }
        public String getOssType() {
            return this.ossType;
        }

    }

}
