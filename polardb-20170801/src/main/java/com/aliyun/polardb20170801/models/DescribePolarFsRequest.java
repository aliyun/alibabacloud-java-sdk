// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsRequest extends TeaModel {
    /**
     * <p>The instance ID of the PolarDB instance on which the application depends.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze8u21s03******</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The page number. The value must be an integer greater than 0 and not exceeding the maximum value of Integer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The description of the PolarFS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-ins1********</p>
     */
    @NameInMap("PolarFsInstanceDescription")
    public String polarFsInstanceDescription;

    /**
     * <p>The list of PolarFS instance IDs, separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>pfs-ins1*******</p>
     */
    @NameInMap("PolarFsInstanceIds")
    public String polarFsInstanceIds;

    /**
     * <p>The PolarFS type.</p>
     * 
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("PolarFsType")
    public String polarFsType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the associated PolarDB cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2zejpr41d9xk*****</p>
     */
    @NameInMap("RelativeDbClusterId")
    public String relativeDbClusterId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribePolarFsRequestTag> tag;

    public static DescribePolarFsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsRequest self = new DescribePolarFsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribePolarFsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarFsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolarFsRequest setPolarFsInstanceDescription(String polarFsInstanceDescription) {
        this.polarFsInstanceDescription = polarFsInstanceDescription;
        return this;
    }
    public String getPolarFsInstanceDescription() {
        return this.polarFsInstanceDescription;
    }

    public DescribePolarFsRequest setPolarFsInstanceIds(String polarFsInstanceIds) {
        this.polarFsInstanceIds = polarFsInstanceIds;
        return this;
    }
    public String getPolarFsInstanceIds() {
        return this.polarFsInstanceIds;
    }

    public DescribePolarFsRequest setPolarFsType(String polarFsType) {
        this.polarFsType = polarFsType;
        return this;
    }
    public String getPolarFsType() {
        return this.polarFsType;
    }

    public DescribePolarFsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePolarFsRequest setRelativeDbClusterId(String relativeDbClusterId) {
        this.relativeDbClusterId = relativeDbClusterId;
        return this;
    }
    public String getRelativeDbClusterId() {
        return this.relativeDbClusterId;
    }

    public DescribePolarFsRequest setTag(java.util.List<DescribePolarFsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribePolarFsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribePolarFsRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>testKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>testValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribePolarFsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsRequestTag self = new DescribePolarFsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePolarFsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
