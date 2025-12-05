// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListVpcConfigsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>9E4FE41E-782D-5CF9-BFAF-2F369EFD803A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("VpcConfigList")
    public java.util.List<ListVpcConfigsResponseBodyVpcConfigList> vpcConfigList;

    public static ListVpcConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVpcConfigsResponseBody self = new ListVpcConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVpcConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVpcConfigsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVpcConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListVpcConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVpcConfigsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListVpcConfigsResponseBody setVpcConfigList(java.util.List<ListVpcConfigsResponseBodyVpcConfigList> vpcConfigList) {
        this.vpcConfigList = vpcConfigList;
        return this;
    }
    public java.util.List<ListVpcConfigsResponseBodyVpcConfigList> getVpcConfigList() {
        return this.vpcConfigList;
    }

    public static class ListVpcConfigsResponseBodyVpcConfigList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>VPC配置信息描述</p>
         */
        @NameInMap("ConfigDescription")
        public String configDescription;

        /**
         * <strong>example:</strong>
         * <p>05AHW</p>
         */
        @NameInMap("ConfigId")
        public String configId;

        /**
         * <strong>example:</strong>
         * <p>my-test-vpc-config-info</p>
         */
        @NameInMap("ConfigName")
        public String configName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>sg-2zeid0dd7bhkynxqpaly</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <strong>example:</strong>
         * <p>1756954374266</p>
         */
        @NameInMap("SortPriority")
        public Long sortPriority;

        /**
         * <strong>example:</strong>
         * <p>vsw-2zes82msebuel5lbw0w1r</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("VpcCidr")
        public String vpcCidr;

        /**
         * <strong>example:</strong>
         * <p>vpc-bp11w3qellkjwnhqxzmt2</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static ListVpcConfigsResponseBodyVpcConfigList build(java.util.Map<String, ?> map) throws Exception {
            ListVpcConfigsResponseBodyVpcConfigList self = new ListVpcConfigsResponseBodyVpcConfigList();
            return TeaModel.build(map, self);
        }

        public ListVpcConfigsResponseBodyVpcConfigList setConfigDescription(String configDescription) {
            this.configDescription = configDescription;
            return this;
        }
        public String getConfigDescription() {
            return this.configDescription;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setConfigId(String configId) {
            this.configId = configId;
            return this;
        }
        public String getConfigId() {
            return this.configId;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setConfigName(String configName) {
            this.configName = configName;
            return this;
        }
        public String getConfigName() {
            return this.configName;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setSortPriority(Long sortPriority) {
            this.sortPriority = sortPriority;
            return this;
        }
        public Long getSortPriority() {
            return this.sortPriority;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setVpcCidr(String vpcCidr) {
            this.vpcCidr = vpcCidr;
            return this;
        }
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        public ListVpcConfigsResponseBodyVpcConfigList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
