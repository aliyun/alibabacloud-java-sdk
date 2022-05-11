// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcVSwitchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("VSwitchCount")
    public Integer vSwitchCount;

    @NameInMap("VSwitchList")
    public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchList> vSwitchList;

    public static GetUserVpcVSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserVpcVSwitchResponseBody self = new GetUserVpcVSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserVpcVSwitchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserVpcVSwitchResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUserVpcVSwitchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserVpcVSwitchResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetUserVpcVSwitchResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetUserVpcVSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserVpcVSwitchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUserVpcVSwitchResponseBody setVSwitchCount(Integer vSwitchCount) {
        this.vSwitchCount = vSwitchCount;
        return this;
    }
    public Integer getVSwitchCount() {
        return this.vSwitchCount;
    }

    public GetUserVpcVSwitchResponseBody setVSwitchList(java.util.List<GetUserVpcVSwitchResponseBodyVSwitchList> vSwitchList) {
        this.vSwitchList = vSwitchList;
        return this;
    }
    public java.util.List<GetUserVpcVSwitchResponseBodyVSwitchList> getVSwitchList() {
        return this.vSwitchList;
    }

    public static class GetUserVpcVSwitchResponseBodyVSwitchList extends TeaModel {
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        @NameInMap("MaxAgentCount")
        public Integer maxAgentCount;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VSwitchName")
        public String vSwitchName;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetUserVpcVSwitchResponseBodyVSwitchList build(java.util.Map<String, ?> map) throws Exception {
            GetUserVpcVSwitchResponseBodyVSwitchList self = new GetUserVpcVSwitchResponseBodyVSwitchList();
            return TeaModel.build(map, self);
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setAvailableIpAddressCount(Long availableIpAddressCount) {
            this.availableIpAddressCount = availableIpAddressCount;
            return this;
        }
        public Long getAvailableIpAddressCount() {
            return this.availableIpAddressCount;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setMaxAgentCount(Integer maxAgentCount) {
            this.maxAgentCount = maxAgentCount;
            return this;
        }
        public Integer getMaxAgentCount() {
            return this.maxAgentCount;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setVSwitchName(String vSwitchName) {
            this.vSwitchName = vSwitchName;
            return this;
        }
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        public GetUserVpcVSwitchResponseBodyVSwitchList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
