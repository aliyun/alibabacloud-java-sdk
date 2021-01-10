// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCRegionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Regions")
    public java.util.List<ListLDCRegionResponseBodyRegions> regions;

    public static ListLDCRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLDCRegionResponseBody self = new ListLDCRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLDCRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLDCRegionResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLDCRegionResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLDCRegionResponseBody setRegions(java.util.List<ListLDCRegionResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<ListLDCRegionResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public static class ListLDCRegionResponseBodyRegionsWorkspaces extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static ListLDCRegionResponseBodyRegionsWorkspaces build(java.util.Map<String, ?> map) throws Exception {
            ListLDCRegionResponseBodyRegionsWorkspaces self = new ListLDCRegionResponseBodyRegionsWorkspaces();
            return TeaModel.build(map, self);
        }

        public ListLDCRegionResponseBodyRegionsWorkspaces setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLDCRegionResponseBodyRegionsWorkspaces setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListLDCRegionResponseBodyRegions extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Workspaces")
        public java.util.List<ListLDCRegionResponseBodyRegionsWorkspaces> workspaces;

        public static ListLDCRegionResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            ListLDCRegionResponseBodyRegions self = new ListLDCRegionResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public ListLDCRegionResponseBodyRegions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListLDCRegionResponseBodyRegions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListLDCRegionResponseBodyRegions setWorkspaces(java.util.List<ListLDCRegionResponseBodyRegionsWorkspaces> workspaces) {
            this.workspaces = workspaces;
            return this;
        }
        public java.util.List<ListLDCRegionResponseBodyRegionsWorkspaces> getWorkspaces() {
            return this.workspaces;
        }

    }

}
