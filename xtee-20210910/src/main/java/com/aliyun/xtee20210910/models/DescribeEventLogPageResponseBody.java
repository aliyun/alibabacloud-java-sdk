// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventLogPageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resultObject")
    public java.util.List<DescribeEventLogPageResponseBodyResultObject> resultObject;

    @NameInMap("totalItem")
    public Integer totalItem;

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
        @NameInMap("accountId")
        public String accountId;

        @NameInMap("email")
        public String email;

        @NameInMap("ip")
        public String ip;

        @NameInMap("mobile")
        public String mobile;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("requestId")
        public String requestId;

        @NameInMap("score")
        public String score;

        @NameInMap("service")
        public String service;

        @NameInMap("tags")
        public String tags;

        @NameInMap("timestamp")
        public String timestamp;

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
