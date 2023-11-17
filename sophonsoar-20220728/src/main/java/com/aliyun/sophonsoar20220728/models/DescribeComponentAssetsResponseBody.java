// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetsResponseBody extends TeaModel {
    @NameInMap("ComponentAssets")
    public java.util.List<DescribeComponentAssetsResponseBodyComponentAssets> componentAssets;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeComponentAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentAssetsResponseBody self = new DescribeComponentAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentAssetsResponseBody setComponentAssets(java.util.List<DescribeComponentAssetsResponseBodyComponentAssets> componentAssets) {
        this.componentAssets = componentAssets;
        return this;
    }
    public java.util.List<DescribeComponentAssetsResponseBodyComponentAssets> getComponentAssets() {
        return this.componentAssets;
    }

    public DescribeComponentAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeComponentAssetsResponseBodyComponentAssets extends TeaModel {
        @NameInMap("AssetUuid")
        public String assetUuid;

        @NameInMap("Componentname")
        public String componentname;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Params")
        public String params;

        public static DescribeComponentAssetsResponseBodyComponentAssets build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentAssetsResponseBodyComponentAssets self = new DescribeComponentAssetsResponseBodyComponentAssets();
            return TeaModel.build(map, self);
        }

        public DescribeComponentAssetsResponseBodyComponentAssets setAssetUuid(String assetUuid) {
            this.assetUuid = assetUuid;
            return this;
        }
        public String getAssetUuid() {
            return this.assetUuid;
        }

        public DescribeComponentAssetsResponseBodyComponentAssets setComponentname(String componentname) {
            this.componentname = componentname;
            return this;
        }
        public String getComponentname() {
            return this.componentname;
        }

        public DescribeComponentAssetsResponseBodyComponentAssets setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeComponentAssetsResponseBodyComponentAssets setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeComponentAssetsResponseBodyComponentAssets setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeComponentAssetsResponseBodyComponentAssets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeComponentAssetsResponseBodyComponentAssets setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

    }

}
