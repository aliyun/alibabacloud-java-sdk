// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeComponentAssetsResponseBody extends TeaModel {
    /**
     * <p>A list of assets.</p>
     */
    @NameInMap("ComponentAssets")
    public java.util.List<DescribeComponentAssetsResponseBodyComponentAssets> componentAssets;

    /**
     * <p>The request ID. Alibaba Cloud generates a unique ID for each request. Use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>BFEFB76D-DD0E-5529-BD57-0DAC10B9B30F</p>
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
         * <p>The asset\&quot;s UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>ff6fe161-93e2-464c-a326-fxxxxxx</p>
         */
        @NameInMap("AssetUuid")
        public String assetUuid;

        /**
         * <p>The name of the component that the asset belongs to.</p>
         * 
         * <strong>example:</strong>
         * <p>pyhton3</p>
         */
        @NameInMap("Componentname")
        public String componentname;

        /**
         * <p>The time when the asset was created. The time is in UTC and follows the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-23T14:38Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the asset was last modified. The time is in UTC and follows the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-23T14:38Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The unique ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>7xx</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The asset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test asset</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The asset configuration in JSON format.</p>
         * <blockquote>
         * <p>For more information about the format, see <a href="~~DescribeComponentAssetForm~~">DescribeComponentAssetForm</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;name&quot;: &quot;authMethod&quot;,
         *         &quot;value&quot;: &quot;ak&quot;
         *     },
         *     {
         *         &quot;name&quot;: &quot;accessKeyId&quot;,
         *         &quot;value&quot;: &quot;xxxxxxx&quot;
         *     },
         *     {
         *         &quot;name&quot;: &quot;accessKeySecret&quot;,
         *         &quot;value&quot;: &quot;xxxxx&quot;
         *     },
         *     {
         *         &quot;name&quot;: &quot;roleArn&quot;,
         *         &quot;value&quot;: &quot;&quot;
         *     }
         * ]</p>
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
