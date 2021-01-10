// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCFlowSiteResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Sites")
    public java.util.List<QueryLDCFlowSiteResponseBodySites> sites;

    public static QueryLDCFlowSiteResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCFlowSiteResponseBody self = new QueryLDCFlowSiteResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLDCFlowSiteResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLDCFlowSiteResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLDCFlowSiteResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLDCFlowSiteResponseBody setSites(java.util.List<QueryLDCFlowSiteResponseBodySites> sites) {
        this.sites = sites;
        return this;
    }
    public java.util.List<QueryLDCFlowSiteResponseBodySites> getSites() {
        return this.sites;
    }

    public static class QueryLDCFlowSiteResponseBodySitesSiteCells extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        @NameInMap("SiteName")
        public String siteName;

        public static QueryLDCFlowSiteResponseBodySitesSiteCells build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCFlowSiteResponseBodySitesSiteCells self = new QueryLDCFlowSiteResponseBodySitesSiteCells();
            return TeaModel.build(map, self);
        }

        public QueryLDCFlowSiteResponseBodySitesSiteCells setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCFlowSiteResponseBodySitesSiteCells setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public QueryLDCFlowSiteResponseBodySitesSiteCells setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

    }

    public static class QueryLDCFlowSiteResponseBodySites extends TeaModel {
        @NameInMap("Current")
        public Boolean current;

        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InterfaceType")
        public String interfaceType;

        @NameInMap("Name")
        public String name;

        @NameInMap("SiteType")
        public String siteType;

        @NameInMap("InterfaceUrls")
        public java.util.List<String> interfaceUrls;

        @NameInMap("SiteCells")
        public java.util.List<QueryLDCFlowSiteResponseBodySitesSiteCells> siteCells;

        public static QueryLDCFlowSiteResponseBodySites build(java.util.Map<String, ?> map) throws Exception {
            QueryLDCFlowSiteResponseBodySites self = new QueryLDCFlowSiteResponseBodySites();
            return TeaModel.build(map, self);
        }

        public QueryLDCFlowSiteResponseBodySites setCurrent(Boolean current) {
            this.current = current;
            return this;
        }
        public Boolean getCurrent() {
            return this.current;
        }

        public QueryLDCFlowSiteResponseBodySites setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryLDCFlowSiteResponseBodySites setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryLDCFlowSiteResponseBodySites setInterfaceType(String interfaceType) {
            this.interfaceType = interfaceType;
            return this;
        }
        public String getInterfaceType() {
            return this.interfaceType;
        }

        public QueryLDCFlowSiteResponseBodySites setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryLDCFlowSiteResponseBodySites setSiteType(String siteType) {
            this.siteType = siteType;
            return this;
        }
        public String getSiteType() {
            return this.siteType;
        }

        public QueryLDCFlowSiteResponseBodySites setInterfaceUrls(java.util.List<String> interfaceUrls) {
            this.interfaceUrls = interfaceUrls;
            return this;
        }
        public java.util.List<String> getInterfaceUrls() {
            return this.interfaceUrls;
        }

        public QueryLDCFlowSiteResponseBodySites setSiteCells(java.util.List<QueryLDCFlowSiteResponseBodySitesSiteCells> siteCells) {
            this.siteCells = siteCells;
            return this;
        }
        public java.util.List<QueryLDCFlowSiteResponseBodySitesSiteCells> getSiteCells() {
            return this.siteCells;
        }

    }

}
