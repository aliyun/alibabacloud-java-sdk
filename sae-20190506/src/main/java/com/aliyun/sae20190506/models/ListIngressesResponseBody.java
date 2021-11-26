// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListIngressesResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("CertId")
        public String certId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ListenerPort")
        public String listenerPort;

        @NameInMap("Name")
        public String name;

        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("SlbId")
        public String slbId;

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
