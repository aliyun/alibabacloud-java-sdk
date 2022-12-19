// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListResponseBody extends TeaModel {
    // An array consisting of the information about the pre-patches that are required to fix the specified Windows system vulnerability.
    @NameInMap("FrontPatchList")
    public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> frontPatchList;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFrontVulPatchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListResponseBody self = new DescribeFrontVulPatchListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListResponseBody setFrontPatchList(java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> frontPatchList) {
        this.frontPatchList = frontPatchList;
        return this;
    }
    public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> getFrontPatchList() {
        return this.frontPatchList;
    }

    public DescribeFrontVulPatchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList extends TeaModel {
        // The name of the Windows system vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The version number of the pre-patch that is required to fix the Windows system vulnerability.
        @NameInMap("Name")
        public String name;

        public static DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList self = new DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeFrontVulPatchListResponseBodyFrontPatchList extends TeaModel {
        // An array consisting of the pre-patches that are required to fix the specified Windows system vulnerability on the server.
        @NameInMap("PatchList")
        public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> patchList;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeFrontVulPatchListResponseBodyFrontPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseBodyFrontPatchList self = new DescribeFrontVulPatchListResponseBodyFrontPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchList setPatchList(java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> patchList) {
            this.patchList = patchList;
            return this;
        }
        public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> getPatchList() {
            return this.patchList;
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
