// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAllAppResourceGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsAllAppResourceGroupResponseBodyResponse response;

    public static QueryRmsAllAppResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAllAppResourceGroupResponseBody self = new QueryRmsAllAppResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsAllAppResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsAllAppResourceGroupResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsAllAppResourceGroupResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsAllAppResourceGroupResponseBody setResponse(QueryRmsAllAppResourceGroupResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsAllAppResourceGroupResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChineseName")
        public String chineseName;

        @NameInMap("Name")
        public String name;

        public static QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps self = new QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps setChineseName(String chineseName) {
            this.chineseName = chineseName;
            return this;
        }
        public String getChineseName() {
            return this.chineseName;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("ChineseName")
        public String chineseName;

        @NameInMap("Name")
        public String name;

        public static QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas self = new QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas setChineseName(String chineseName) {
            this.chineseName = chineseName;
            return this;
        }
        public String getChineseName() {
            return this.chineseName;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("AppDatas")
        public java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas> appDatas;

        public static QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains self = new QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains setAppDatas(java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas> appDatas) {
            this.appDatas = appDatas;
            return this;
        }
        public java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomainsAppDatas> getAppDatas() {
            return this.appDatas;
        }

    }

    public static class QueryRmsAllAppResourceGroupResponseBodyResponseEntity extends TeaModel {
        @NameInMap("Apps")
        public java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps> apps;

        @NameInMap("Domains")
        public java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains> domains;

        public static QueryRmsAllAppResourceGroupResponseBodyResponseEntity build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllAppResourceGroupResponseBodyResponseEntity self = new QueryRmsAllAppResourceGroupResponseBodyResponseEntity();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntity setApps(java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps> apps) {
            this.apps = apps;
            return this;
        }
        public java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityApps> getApps() {
            return this.apps;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponseEntity setDomains(java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains> domains) {
            this.domains = domains;
            return this;
        }
        public java.util.List<QueryRmsAllAppResourceGroupResponseBodyResponseEntityDomains> getDomains() {
            return this.domains;
        }

    }

    public static class QueryRmsAllAppResourceGroupResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Entity")
        public QueryRmsAllAppResourceGroupResponseBodyResponseEntity entity;

        public static QueryRmsAllAppResourceGroupResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsAllAppResourceGroupResponseBodyResponse self = new QueryRmsAllAppResourceGroupResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsAllAppResourceGroupResponseBodyResponse setEntity(QueryRmsAllAppResourceGroupResponseBodyResponseEntity entity) {
            this.entity = entity;
            return this;
        }
        public QueryRmsAllAppResourceGroupResponseBodyResponseEntity getEntity() {
            return this.entity;
        }

    }

}
