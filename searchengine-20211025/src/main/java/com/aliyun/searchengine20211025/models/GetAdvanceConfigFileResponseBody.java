// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigFileResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>10D5E615-69F7-5F49-B850-00169ADE513C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The result</p>
     */
    @NameInMap("result")
    public GetAdvanceConfigFileResponseBodyResult result;

    public static GetAdvanceConfigFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigFileResponseBody self = new GetAdvanceConfigFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAdvanceConfigFileResponseBody setResult(GetAdvanceConfigFileResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAdvanceConfigFileResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAdvanceConfigFileResponseBodyResult extends TeaModel {
        /**
         * <p>The content of the file</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;summarys&quot;:{&quot;parameter&quot;:{&quot;file_compressor&quot;:&quot;zstd&quot;},&quot;summary_fields&quot;:[&quot;id&quot;]},&quot;file_compress&quot;:[{&quot;name&quot;:&quot;file_compressor&quot;,&quot;type&quot;:&quot;zstd&quot;},{&quot;name&quot;:&quot;no_compressor&quot;,&quot;type&quot;:&quot;&quot;}],&quot;indexs&quot;:[{&quot;index_fields&quot;:&quot;name&quot;,&quot;index_name&quot;:&quot;ids&quot;,&quot;index_type&quot;:&quot;STRING&quot;},{&quot;has_primary_key_attribute&quot;:true,&quot;index_fields&quot;:&quot;id&quot;,&quot;is_primary_key_sorted&quot;:false,&quot;index_name&quot;:&quot;id&quot;,&quot;index_type&quot;:&quot;PRIMARYKEY64&quot;}],&quot;attributes&quot;:[{&quot;file_compress&quot;:&quot;no_compressor&quot;,&quot;field_name&quot;:&quot;id&quot;}],&quot;fields&quot;:[{&quot;user_defined_param&quot;:{},&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;id&quot;},{&quot;compress_type&quot;:&quot;uniq&quot;,&quot;field_type&quot;:&quot;STRING&quot;,&quot;field_name&quot;:&quot;name&quot;}],&quot;table_name&quot;:&quot;api&quot;}</p>
         */
        @NameInMap("content")
        public String content;

        public static GetAdvanceConfigFileResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAdvanceConfigFileResponseBodyResult self = new GetAdvanceConfigFileResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAdvanceConfigFileResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
