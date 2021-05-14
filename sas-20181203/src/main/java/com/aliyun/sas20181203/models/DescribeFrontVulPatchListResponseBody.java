// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeFrontVulPatchListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FrontPatchList")
    public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> frontPatchList;

    public static DescribeFrontVulPatchListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFrontVulPatchListResponseBody self = new DescribeFrontVulPatchListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFrontVulPatchListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFrontVulPatchListResponseBody setFrontPatchList(java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> frontPatchList) {
        this.frontPatchList = frontPatchList;
        return this;
    }
    public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchList> getFrontPatchList() {
        return this.frontPatchList;
    }

    public static class DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("AliasName")
        public String aliasName;

        public static DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList self = new DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

    }

    public static class DescribeFrontVulPatchListResponseBodyFrontPatchList extends TeaModel {
        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("PatchList")
        public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> patchList;

        public static DescribeFrontVulPatchListResponseBodyFrontPatchList build(java.util.Map<String, ?> map) throws Exception {
            DescribeFrontVulPatchListResponseBodyFrontPatchList self = new DescribeFrontVulPatchListResponseBodyFrontPatchList();
            return TeaModel.build(map, self);
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeFrontVulPatchListResponseBodyFrontPatchList setPatchList(java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> patchList) {
            this.patchList = patchList;
            return this;
        }
        public java.util.List<DescribeFrontVulPatchListResponseBodyFrontPatchListPatchList> getPatchList() {
            return this.patchList;
        }

    }

}
