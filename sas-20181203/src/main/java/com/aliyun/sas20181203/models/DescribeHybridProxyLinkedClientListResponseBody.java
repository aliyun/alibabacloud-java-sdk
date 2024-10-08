// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeHybridProxyLinkedClientListResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<DescribeHybridProxyLinkedClientListResponseBodyList> list;

    @NameInMap("PageInfo")
    public DescribeHybridProxyLinkedClientListResponseBodyPageInfo pageInfo;

    /**
     * <strong>example:</strong>
     * <p>B01B804F-947C-5623-B050-1C8FDFA796CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHybridProxyLinkedClientListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHybridProxyLinkedClientListResponseBody self = new DescribeHybridProxyLinkedClientListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHybridProxyLinkedClientListResponseBody setList(java.util.List<DescribeHybridProxyLinkedClientListResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DescribeHybridProxyLinkedClientListResponseBodyList> getList() {
        return this.list;
    }

    public DescribeHybridProxyLinkedClientListResponseBody setPageInfo(DescribeHybridProxyLinkedClientListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeHybridProxyLinkedClientListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeHybridProxyLinkedClientListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHybridProxyLinkedClientListResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <strong>example:</strong>
         * <p>i-bp1a69mvjujbakxu****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>sql-test-0****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <strong>example:</strong>
         * <p>centos-xxx</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>centos</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("VendorName")
        public String vendorName;

        public static DescribeHybridProxyLinkedClientListResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyLinkedClientListResponseBodyList self = new DescribeHybridProxyLinkedClientListResponseBodyList();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyList setVendorName(String vendorName) {
            this.vendorName = vendorName;
            return this;
        }
        public String getVendorName() {
            return this.vendorName;
        }

    }

    public static class DescribeHybridProxyLinkedClientListResponseBodyPageInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHybridProxyLinkedClientListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeHybridProxyLinkedClientListResponseBodyPageInfo self = new DescribeHybridProxyLinkedClientListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeHybridProxyLinkedClientListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeHybridProxyLinkedClientListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
