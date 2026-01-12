// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceStorageConfigResponseBody extends TeaModel {
    /**
     * <p>The storage configurations.</p>
     */
    @NameInMap("ConfigList")
    public java.util.List<DescribeInstanceStorageConfigResponseBodyConfigList> configList;

    /**
     * <p>The ID of the RDS Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeInstanceStorageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStorageConfigResponseBody self = new DescribeInstanceStorageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStorageConfigResponseBody setConfigList(java.util.List<DescribeInstanceStorageConfigResponseBodyConfigList> configList) {
        this.configList = configList;
        return this;
    }
    public java.util.List<DescribeInstanceStorageConfigResponseBodyConfigList> getConfigList() {
        return this.configList;
    }

    public DescribeInstanceStorageConfigResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeInstanceStorageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeInstanceStorageConfigResponseBodyConfigList extends TeaModel {
        /**
         * <p>The configuration item name. Valid values:</p>
         * <ul>
         * <li><strong>AWS_SESSION_TOKEN</strong>: temporary OSS access token (session token).</li>
         * <li><strong>AWS_ACCESS_KEY_ID</strong>: the AccessKey ID of OSS.</li>
         * <li><strong>AWS_SECRET_ACCESS_KEY</strong>: the AccessKey secret of OSS.</li>
         * <li><strong>GLOBAL_S3_BUCKET</strong>: the name of the OSS bucket.</li>
         * <li><strong>TENANT_ID</strong>: the tenant ID of the OSS Prefix (prefix or directory).</li>
         * <li><strong>GLOBAL_S3_ENDPOINT</strong>: the endpoint of OSS.</li>
         * <li><strong>REGION</strong>: the region of OSS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REGION</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstanceStorageConfigResponseBodyConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceStorageConfigResponseBodyConfigList self = new DescribeInstanceStorageConfigResponseBodyConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceStorageConfigResponseBodyConfigList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceStorageConfigResponseBodyConfigList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
