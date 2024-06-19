// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeParameterGroupSupportParamResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BB73740C-23E2-4392-9DA4-2660C74C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The parameters.</p>
     */
    @NameInMap("ResourceList")
    public java.util.List<DescribeParameterGroupSupportParamResponseBodyResourceList> resourceList;

    public static DescribeParameterGroupSupportParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterGroupSupportParamResponseBody self = new DescribeParameterGroupSupportParamResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeParameterGroupSupportParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeParameterGroupSupportParamResponseBody setResourceList(java.util.List<DescribeParameterGroupSupportParamResponseBodyResourceList> resourceList) {
        this.resourceList = resourceList;
        return this;
    }
    public java.util.List<DescribeParameterGroupSupportParamResponseBodyResourceList> getResourceList() {
        return this.resourceList;
    }

    public static class DescribeParameterGroupSupportParamResponseBodyResourceList extends TeaModel {
        /**
         * <p>The service category.</p>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>The name of the parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>rt_threshold_ms</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        public static DescribeParameterGroupSupportParamResponseBodyResourceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeParameterGroupSupportParamResponseBodyResourceList self = new DescribeParameterGroupSupportParamResponseBodyResourceList();
            return TeaModel.build(map, self);
        }

        public DescribeParameterGroupSupportParamResponseBodyResourceList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeParameterGroupSupportParamResponseBodyResourceList setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeParameterGroupSupportParamResponseBodyResourceList setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeParameterGroupSupportParamResponseBodyResourceList setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

    }

}
