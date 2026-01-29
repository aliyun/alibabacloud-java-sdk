// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationIds")
    public String applicationIds;

    @NameInMap("ApplicationTypes")
    public String applicationTypes;

    /**
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<DescribeApplicationsRequestTag> tag;

    public static DescribeApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationsRequest self = new DescribeApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationsRequest setApplicationIds(String applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public String getApplicationIds() {
        return this.applicationIds;
    }

    public DescribeApplicationsRequest setApplicationTypes(String applicationTypes) {
        this.applicationTypes = applicationTypes;
        return this;
    }
    public String getApplicationTypes() {
        return this.applicationTypes;
    }

    public DescribeApplicationsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeApplicationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApplicationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApplicationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeApplicationsRequest setTag(java.util.List<DescribeApplicationsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeApplicationsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeApplicationsRequestTag extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeApplicationsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeApplicationsRequestTag self = new DescribeApplicationsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeApplicationsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApplicationsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
