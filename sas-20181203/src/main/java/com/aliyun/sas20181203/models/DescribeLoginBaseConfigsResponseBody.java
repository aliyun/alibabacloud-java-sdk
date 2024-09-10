// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeLoginBaseConfigsResponseBody extends TeaModel {
    /**
     * <p>The description of the configuration.</p>
     */
    @NameInMap("BaseConfigs")
    public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> baseConfigs;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2C2D4B3C-0524-17B1-93D2-DA50119F4E1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoginBaseConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoginBaseConfigsResponseBody self = new DescribeLoginBaseConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoginBaseConfigsResponseBody setBaseConfigs(java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> baseConfigs) {
        this.baseConfigs = baseConfigs;
        return this;
    }
    public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigs> getBaseConfigs() {
        return this.baseConfigs;
    }

    public DescribeLoginBaseConfigsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeLoginBaseConfigsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoginBaseConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoginBaseConfigsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList extends TeaModel {
        /**
         * <p>The UUID or group ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>0011ea53-738c-4bff-93be-ce6a1cc9****</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The type of the server to which the configuration is applied. Valid values:</p>
         * <ul>
         * <li><strong>uuid</strong>: a server</li>
         * <li><strong>groupId</strong>: a server group</li>
         * <li><strong>global</strong>: all servers</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        public static DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList self = new DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList();
            return TeaModel.build(map, self);
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

    public static class DescribeLoginBaseConfigsResponseBodyBaseConfigs extends TeaModel {
        /**
         * <p>The common logon account.</p>
         * 
         * <strong>example:</strong>
         * <p>1582318****</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The end time of the common logon time range.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The common logon IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The common logon location.</p>
         * 
         * <strong>example:</strong>
         * <p>Montenegro</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>Corresponding configuration remark information.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The start time of the common logon time range.</p>
         * 
         * <strong>example:</strong>
         * <p>08:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The details of the servers to which the configuration is applied.</p>
         */
        @NameInMap("TargetList")
        public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> targetList;

        /**
         * <p>The total number of servers.</p>
         * 
         * <strong>example:</strong>
         * <p>172</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The number of servers to which the configuration is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("UuidCount")
        public Integer uuidCount;

        public static DescribeLoginBaseConfigsResponseBodyBaseConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoginBaseConfigsResponseBodyBaseConfigs self = new DescribeLoginBaseConfigsResponseBodyBaseConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setTargetList(java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> targetList) {
            this.targetList = targetList;
            return this;
        }
        public java.util.List<DescribeLoginBaseConfigsResponseBodyBaseConfigsTargetList> getTargetList() {
            return this.targetList;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeLoginBaseConfigsResponseBodyBaseConfigs setUuidCount(Integer uuidCount) {
            this.uuidCount = uuidCount;
            return this;
        }
        public Integer getUuidCount() {
            return this.uuidCount;
        }

    }

}
