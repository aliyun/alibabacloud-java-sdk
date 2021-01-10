// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSClusterSecuritygroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<ListAKSClusterSecuritygroupResponseBodyData> data;

    public static ListAKSClusterSecuritygroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAKSClusterSecuritygroupResponseBody self = new ListAKSClusterSecuritygroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAKSClusterSecuritygroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAKSClusterSecuritygroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAKSClusterSecuritygroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListAKSClusterSecuritygroupResponseBody setData(java.util.List<ListAKSClusterSecuritygroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAKSClusterSecuritygroupResponseBodyData> getData() {
        return this.data;
    }

    public static class ListAKSClusterSecuritygroupResponseBodyData extends TeaModel {
        @NameInMap("IaasProviderId")
        public String iaasProviderId;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SecuredGroupIdentity")
        public String securedGroupIdentity;

        @NameInMap("SecuredZoneId")
        public String securedZoneId;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        public static ListAKSClusterSecuritygroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAKSClusterSecuritygroupResponseBodyData self = new ListAKSClusterSecuritygroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAKSClusterSecuritygroupResponseBodyData setIaasProviderId(String iaasProviderId) {
            this.iaasProviderId = iaasProviderId;
            return this;
        }
        public String getIaasProviderId() {
            return this.iaasProviderId;
        }

        public ListAKSClusterSecuritygroupResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAKSClusterSecuritygroupResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAKSClusterSecuritygroupResponseBodyData setSecuredGroupIdentity(String securedGroupIdentity) {
            this.securedGroupIdentity = securedGroupIdentity;
            return this;
        }
        public String getSecuredGroupIdentity() {
            return this.securedGroupIdentity;
        }

        public ListAKSClusterSecuritygroupResponseBodyData setSecuredZoneId(String securedZoneId) {
            this.securedZoneId = securedZoneId;
            return this;
        }
        public String getSecuredZoneId() {
            return this.securedZoneId;
        }

        public ListAKSClusterSecuritygroupResponseBodyData setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListAKSClusterSecuritygroupResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

}
