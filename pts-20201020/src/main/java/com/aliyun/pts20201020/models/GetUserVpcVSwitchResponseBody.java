// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class GetUserVpcVSwitchResponseBody extends TeaModel {
    /**
     * <p>The system status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message. If the request was successful, this parameter is left empty.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of returned entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0235E5FC-4C7C-5F0C-843C-FC674F15F947</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The number of vSwitches.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("VSwitchCount")
    public Integer vSwitchCount;

    /**
     * <p>The vSwitches.</p>
     */
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
        /**
         * <p>The number of available IP addresses in the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("AvailableIpAddressCount")
        public Long availableIpAddressCount;

        /**
         * <p>The maximum number of stress testers to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxAgentCount")
        public Integer maxAgentCount;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1eil9df23rsd8l1sevebiszooj</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The vSwitch name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-vswitch</p>
         */
        @NameInMap("VSwitchName")
        public String vSwitchName;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-wz9bpdaebft6j23fesdf84v2f1um3a</p>
         */
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
