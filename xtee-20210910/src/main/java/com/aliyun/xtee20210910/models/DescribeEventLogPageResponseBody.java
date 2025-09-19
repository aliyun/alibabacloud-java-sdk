// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventLogPageResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Integer currentPage;

    /**
     * <p>Page size, default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Returned object.</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeEventLogPageResponseBodyResultObject> resultObject;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("totalItem")
    public Integer totalItem;

    /**
     * <p>Total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("totalPage")
    public Integer totalPage;

    public static DescribeEventLogPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogPageResponseBody self = new DescribeEventLogPageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventLogPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventLogPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEventLogPageResponseBody setResultObject(java.util.List<DescribeEventLogPageResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeEventLogPageResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeEventLogPageResponseBody setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Integer getTotalItem() {
        return this.totalItem;
    }

    public DescribeEventLogPageResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeEventLogPageResponseBodyResultObject extends TeaModel {
        /**
         * <p>Account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1631801314885832</p>
         */
        @NameInMap("accountId")
        public String accountId;

        /**
         * <p>Email.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxx@123.com">xxxx@123.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <p>IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.200.5.100</p>
         */
        @NameInMap("ip")
        public String ip;

        /**
         * <p>Mobile phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>13817606333</p>
         */
        @NameInMap("mobile")
        public String mobile;

        /**
         * <p>Nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>昵称</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>546F8063-0104-5271-9EB7-56FB3F375BAD</p>
         */
        @NameInMap("requestId")
        public String requestId;

        /**
         * <p>Score.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("score")
        public String score;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册事件</p>
         */
        @NameInMap("service")
        public String service;

        /**
         * <p>Tags.</p>
         * 
         * <strong>example:</strong>
         * <p>rm0102</p>
         */
        @NameInMap("tags")
        public String tags;

        /**
         * <p>Transaction time.</p>
         * 
         * <strong>example:</strong>
         * <p>1737101348000</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        /**
         * <p>Device ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4239</p>
         */
        @NameInMap("umid")
        public String umid;

        public static DescribeEventLogPageResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventLogPageResponseBodyResultObject self = new DescribeEventLogPageResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventLogPageResponseBodyResultObject setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public DescribeEventLogPageResponseBodyResultObject setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeEventLogPageResponseBodyResultObject setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeEventLogPageResponseBodyResultObject setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public DescribeEventLogPageResponseBodyResultObject setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public DescribeEventLogPageResponseBodyResultObject setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeEventLogPageResponseBodyResultObject setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public DescribeEventLogPageResponseBodyResultObject setService(String service) {
            this.service = service;
            return this;
        }
        public String getService() {
            return this.service;
        }

        public DescribeEventLogPageResponseBodyResultObject setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeEventLogPageResponseBodyResultObject setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public DescribeEventLogPageResponseBodyResultObject setUmid(String umid) {
            this.umid = umid;
            return this;
        }
        public String getUmid() {
            return this.umid;
        }

    }

}
