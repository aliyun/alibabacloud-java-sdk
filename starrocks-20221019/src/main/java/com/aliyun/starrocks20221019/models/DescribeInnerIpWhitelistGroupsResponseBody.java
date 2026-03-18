// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeInnerIpWhitelistGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE74XXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("data")
    public java.util.List<DescribeInnerIpWhitelistGroupsResponseBodyData> data;

    public static DescribeInnerIpWhitelistGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInnerIpWhitelistGroupsResponseBody self = new DescribeInnerIpWhitelistGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInnerIpWhitelistGroupsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeInnerIpWhitelistGroupsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeInnerIpWhitelistGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeInnerIpWhitelistGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInnerIpWhitelistGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInnerIpWhitelistGroupsResponseBody setData(java.util.List<DescribeInnerIpWhitelistGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeInnerIpWhitelistGroupsResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeInnerIpWhitelistGroupsResponseBodyData extends TeaModel {
        @NameInMap("CidrIpList")
        public java.util.List<String> cidrIpList;

        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("InnerIpWhitelistGroupId")
        public String innerIpWhitelistGroupId;

        public static DescribeInnerIpWhitelistGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeInnerIpWhitelistGroupsResponseBodyData self = new DescribeInnerIpWhitelistGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeInnerIpWhitelistGroupsResponseBodyData setCidrIpList(java.util.List<String> cidrIpList) {
            this.cidrIpList = cidrIpList;
            return this;
        }
        public java.util.List<String> getCidrIpList() {
            return this.cidrIpList;
        }

        public DescribeInnerIpWhitelistGroupsResponseBodyData setInnerIpWhitelistGroupId(String innerIpWhitelistGroupId) {
            this.innerIpWhitelistGroupId = innerIpWhitelistGroupId;
            return this;
        }
        public String getInnerIpWhitelistGroupId() {
            return this.innerIpWhitelistGroupId;
        }

    }

}
