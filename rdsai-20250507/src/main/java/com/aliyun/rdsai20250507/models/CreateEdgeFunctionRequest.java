// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class CreateEdgeFunctionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCz****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The code parameters.</p>
     */
    @NameInMap("Code")
    public CreateEdgeFunctionRequestCode code;

    /**
     * <p>The configuration parameters of the edge function.</p>
     */
    @NameInMap("CustomConfig")
    public java.util.Map<String, Integer> customConfig;

    /**
     * <p>The name of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>ef-*****</p>
     */
    @NameInMap("EdgeFunctionName")
    public String edgeFunctionName;

    /**
     * <p>The environment variables.</p>
     */
    @NameInMap("Envs")
    public java.util.Map<String, String> envs;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
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

    public static CreateEdgeFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeFunctionRequest self = new CreateEdgeFunctionRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeFunctionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateEdgeFunctionRequest setCode(CreateEdgeFunctionRequestCode code) {
        this.code = code;
        return this;
    }
    public CreateEdgeFunctionRequestCode getCode() {
        return this.code;
    }

    public CreateEdgeFunctionRequest setCustomConfig(java.util.Map<String, Integer> customConfig) {
        this.customConfig = customConfig;
        return this;
    }
    public java.util.Map<String, Integer> getCustomConfig() {
        return this.customConfig;
    }

    public CreateEdgeFunctionRequest setEdgeFunctionName(String edgeFunctionName) {
        this.edgeFunctionName = edgeFunctionName;
        return this;
    }
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
    }

    public CreateEdgeFunctionRequest setEnvs(java.util.Map<String, String> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    public CreateEdgeFunctionRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateEdgeFunctionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateEdgeFunctionRequestCode extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>The OSS path of a code file.</p>
         * 
         * <strong>example:</strong>
         * <p>example.zip</p>
         */
        @NameInMap("OssObjectName")
        public String ossObjectName;

        /**
         * <p>The storage class of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>supabase</p>
         */
        @NameInMap("OssType")
        public String ossType;

        public static CreateEdgeFunctionRequestCode build(java.util.Map<String, ?> map) throws Exception {
            CreateEdgeFunctionRequestCode self = new CreateEdgeFunctionRequestCode();
            return TeaModel.build(map, self);
        }

        public CreateEdgeFunctionRequestCode setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateEdgeFunctionRequestCode setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public CreateEdgeFunctionRequestCode setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public CreateEdgeFunctionRequestCode setOssType(String ossType) {
            this.ossType = ossType;
            return this;
        }
        public String getOssType() {
            return this.ossType;
        }

    }

}
