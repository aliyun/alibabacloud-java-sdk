// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetsResponseBody extends TeaModel {
    /**
     * <p>The information about the assets.</p>
     */
    @NameInMap("ComponentAssets")
    public java.util.List<DescribeComponentAssetsResponseBodyComponentAssets> componentAssets;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The UUID of the asset.</p>
         */
        @NameInMap("AssetUuid")
        public String assetUuid;

        /**
         * <p>The name of the component to which the asset belongs.</p>
         */
        @NameInMap("Componentname")
        public String componentname;

        /**
         * <p>The time when the asset was created. The time is in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the asset was modified. The time is in the yyyy-MM-ddTHH:mm:ssZ format and is displayed in UTC.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The UUID of the asset.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the asset.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The configurations of the asset in the JSON string format. DescribeComponentAssetForm</p>
         * <br>
         * <p>>  For more information, see [DescribeComponentAssetForm](~~DescribeComponentAssetForm~~).</p>
         */
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
