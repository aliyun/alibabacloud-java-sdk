// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMSDssIdcResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Idcs")
    public java.util.List<ListMSDssIdcResponseBodyIdcs> idcs;

    public static ListMSDssIdcResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMSDssIdcResponseBody self = new ListMSDssIdcResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMSDssIdcResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMSDssIdcResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMSDssIdcResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListMSDssIdcResponseBody setIdcs(java.util.List<ListMSDssIdcResponseBodyIdcs> idcs) {
        this.idcs = idcs;
        return this;
    }
    public java.util.List<ListMSDssIdcResponseBodyIdcs> getIdcs() {
        return this.idcs;
    }

    public static class ListMSDssIdcResponseBodyIdcs extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Preprod")
        public Boolean preprod;

        public static ListMSDssIdcResponseBodyIdcs build(java.util.Map<String, ?> map) throws Exception {
            ListMSDssIdcResponseBodyIdcs self = new ListMSDssIdcResponseBodyIdcs();
            return TeaModel.build(map, self);
        }

        public ListMSDssIdcResponseBodyIdcs setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListMSDssIdcResponseBodyIdcs setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMSDssIdcResponseBodyIdcs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMSDssIdcResponseBodyIdcs setPreprod(Boolean preprod) {
            this.preprod = preprod;
            return this;
        }
        public Boolean getPreprod() {
            return this.preprod;
        }

    }

}
