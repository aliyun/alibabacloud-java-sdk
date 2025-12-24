// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeOpenApiListResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeOpenApiListResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EF2ECA2D-D8E6-5021-BF5C-19DD6D52C5B2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenApiListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenApiListResponseBody self = new DescribeOpenApiListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenApiListResponseBody setData(DescribeOpenApiListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOpenApiListResponseBodyData getData() {
        return this.data;
    }

    public DescribeOpenApiListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenApiListResponseBodyData extends TeaModel {
        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>200: successful.</li>
         * <li>500: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The information about the returned APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;apis&quot;:[{&quot;summary&quot;:&quot;get account information&quot;,&quot;deprecated&quot;:false,&quot;name&quot;:&quot;DescAccountSummary&quot;,&quot;title&quot;:&quot;get account information&quot;}],&quot;childrens&quot;:[],&quot;title&quot;:&quot;account&quot;}]</p>
         */
        @NameInMap("Directories")
        public Object directories;

        /**
         * <p>The version number of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-12-03</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeOpenApiListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenApiListResponseBodyData self = new DescribeOpenApiListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOpenApiListResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOpenApiListResponseBodyData setDirectories(Object directories) {
            this.directories = directories;
            return this;
        }
        public Object getDirectories() {
            return this.directories;
        }

        public DescribeOpenApiListResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
