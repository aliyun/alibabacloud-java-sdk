// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListSipTrunksResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
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
     * <p>The list of SIP trunks.</p>
     */
    @NameInMap("List")
    public java.util.List<ListSipTrunksResponseBodyList> list;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSipTrunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSipTrunksResponseBody self = new ListSipTrunksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSipTrunksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSipTrunksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSipTrunksResponseBody setList(java.util.List<ListSipTrunksResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSipTrunksResponseBodyList> getList() {
        return this.list;
    }

    public ListSipTrunksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSipTrunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSipTrunksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSipTrunksResponseBodyListIps extends TeaModel {
        /**
         * <p>The IP address of the SIP trunk.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        public static ListSipTrunksResponseBodyListIps build(java.util.Map<String, ?> map) throws Exception {
            ListSipTrunksResponseBodyListIps self = new ListSipTrunksResponseBodyListIps();
            return TeaModel.build(map, self);
        }

        public ListSipTrunksResponseBodyListIps setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

    public static class ListSipTrunksResponseBodyList extends TeaModel {
        /**
         * <p>The description of the SIP trunk.</p>
         * 
         * <strong>example:</strong>
         * <p>Test environment SIP trunk</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The creation timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1727654400000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The list of IP addresses of the SIP trunk.</p>
         */
        @NameInMap("Ips")
        public java.util.List<ListSipTrunksResponseBodyListIps> ips;

        /**
         * <p>The unique identifier of the SIP trunk.</p>
         * 
         * <strong>example:</strong>
         * <p>6bf8a1d2-3c4e-4f5a-9b8c-7d6e5f4a3b2c</p>
         */
        @NameInMap("TrunkId")
        public String trunkId;

        /**
         * <p>The name of the SIP trunk.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-trunk-demo</p>
         */
        @NameInMap("TrunkName")
        public String trunkName;

        public static ListSipTrunksResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSipTrunksResponseBodyList self = new ListSipTrunksResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSipTrunksResponseBodyList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSipTrunksResponseBodyList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListSipTrunksResponseBodyList setIps(java.util.List<ListSipTrunksResponseBodyListIps> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<ListSipTrunksResponseBodyListIps> getIps() {
            return this.ips;
        }

        public ListSipTrunksResponseBodyList setTrunkId(String trunkId) {
            this.trunkId = trunkId;
            return this;
        }
        public String getTrunkId() {
            return this.trunkId;
        }

        public ListSipTrunksResponseBodyList setTrunkName(String trunkName) {
            this.trunkName = trunkName;
            return this;
        }
        public String getTrunkName() {
            return this.trunkName;
        }

    }

}
