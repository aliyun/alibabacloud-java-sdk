// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationsRequest extends TeaModel {
    /**
     * <p>A list of application IDs. If specified, this operation returns information only about the specified applications.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationIds")
    public String applicationIds;

    @NameInMap("ApplicationTypes")
    public String applicationTypes;

    /**
     * <p>The ID of the PolarDB instance. If specified, this operation returns information only about applications associated with this instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * <p>Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>A list of tags. A tag is a key-value pair.</p>
     */
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
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
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
