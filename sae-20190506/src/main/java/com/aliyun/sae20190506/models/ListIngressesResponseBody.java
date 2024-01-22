// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    /**
     * <p>The port specified for the SLB listener.</p>
     */
    @NameInMap("Data")
    public ListIngressesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the namespace.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the SLB instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The name of the routing rule.</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListIngressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIngressesResponseBody self = new ListIngressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIngressesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIngressesResponseBody setData(ListIngressesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIngressesResponseBodyData getData() {
        return this.data;
    }

    public ListIngressesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListIngressesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIngressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIngressesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIngressesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListIngressesResponseBodyDataIngressList extends TeaModel {
        /**
         * <p>The error code. </p>
         * <br>
         * <p>- The **ErrorCode** parameter is not returned when the request succeeds.</p>
         * <p>- The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
         */
        @NameInMap("CertId")
        public String certId;

        @NameInMap("CertIds")
        public String certIds;

        /**
         * <p>The ID of the routing rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the list of routing rules was obtained. Valid values:</p>
         * <br>
         * <p>*   **true**: indicates that the list was obtained.</p>
         * <p>*   **false**: indicates that the list could not be obtained.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The type of the SLB instance based on the processing capabilities. Valid values:</p>
         * <br>
         * <p>*   **clb**: the Classic Load Balancer (CLB) instance.</p>
         * <p>*   **alb**: the Application Load Balancer (ALB) instance.</p>
         */
        @NameInMap("ListenerPort")
        public String listenerPort;

        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        @NameInMap("LoadBalanceType")
        public String loadBalanceType;

        @NameInMap("MseGatewayId")
        public String mseGatewayId;

        @NameInMap("MseGatewayPort")
        public String mseGatewayPort;

        @NameInMap("MseGatewayProtocol")
        public String mseGatewayProtocol;

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <br>
         * <p>*   **2xx**: indicates that the request was successful.</p>
         * <p>*   **3xx**: indicates that the request was redirected.</p>
         * <p>*   **4xx**: indicates that the request was invalid.</p>
         * <p>*   **5xx**: indicates that a server error occurred.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the routing rule.</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The ID of the certificate.</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The protocol used to forward requests. Valid values:</p>
         * <br>
         * <p>*   **HTTP**: used when the application needs to identify the transmitted data.</p>
         * <p>*   **HTTPS**: used when the application requires encrypted data transmission.</p>
         */
        @NameInMap("SlbType")
        public String slbType;

        public static ListIngressesResponseBodyDataIngressList build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyDataIngressList self = new ListIngressesResponseBodyDataIngressList();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyDataIngressList setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public ListIngressesResponseBodyDataIngressList setCertIds(String certIds) {
            this.certIds = certIds;
            return this;
        }
        public String getCertIds() {
            return this.certIds;
        }

        public ListIngressesResponseBodyDataIngressList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIngressesResponseBodyDataIngressList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIngressesResponseBodyDataIngressList setListenerPort(String listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public String getListenerPort() {
            return this.listenerPort;
        }

        public ListIngressesResponseBodyDataIngressList setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListIngressesResponseBodyDataIngressList setLoadBalanceType(String loadBalanceType) {
            this.loadBalanceType = loadBalanceType;
            return this;
        }
        public String getLoadBalanceType() {
            return this.loadBalanceType;
        }

        public ListIngressesResponseBodyDataIngressList setMseGatewayId(String mseGatewayId) {
            this.mseGatewayId = mseGatewayId;
            return this;
        }
        public String getMseGatewayId() {
            return this.mseGatewayId;
        }

        public ListIngressesResponseBodyDataIngressList setMseGatewayPort(String mseGatewayPort) {
            this.mseGatewayPort = mseGatewayPort;
            return this;
        }
        public String getMseGatewayPort() {
            return this.mseGatewayPort;
        }

        public ListIngressesResponseBodyDataIngressList setMseGatewayProtocol(String mseGatewayProtocol) {
            this.mseGatewayProtocol = mseGatewayProtocol;
            return this;
        }
        public String getMseGatewayProtocol() {
            return this.mseGatewayProtocol;
        }

        public ListIngressesResponseBodyDataIngressList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIngressesResponseBodyDataIngressList setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListIngressesResponseBodyDataIngressList setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListIngressesResponseBodyDataIngressList setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

    }

    public static class ListIngressesResponseBodyData extends TeaModel {
        /**
         * <p>The type of the SLB instance based on the IP address. Valid values:</p>
         * <br>
         * <p>*   **internet**: the Internet-facing SLB instance.</p>
         * <p>*   **intranet**: the internal-facing SLB instance.</p>
         */
        @NameInMap("IngressList")
        public java.util.List<ListIngressesResponseBodyDataIngressList> ingressList;

        public static ListIngressesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyData self = new ListIngressesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyData setIngressList(java.util.List<ListIngressesResponseBodyDataIngressList> ingressList) {
            this.ingressList = ingressList;
            return this;
        }
        public java.util.List<ListIngressesResponseBodyDataIngressList> getIngressList() {
            return this.ingressList;
        }

    }

}
