// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceParamsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>022F36C7-9FB4-5D67-BEBC-3D14B0984463</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("result")
    public UpdateSqlInstanceParamsResponseBodyResult result;

    public static UpdateSqlInstanceParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceParamsResponseBody self = new UpdateSqlInstanceParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSqlInstanceParamsResponseBody setResult(UpdateSqlInstanceParamsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateSqlInstanceParamsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateSqlInstanceParamsResponseBodyResult extends TeaModel {
        /**
         * <p>The combined parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("combineParams")
        public String combineParams;

        /**
         * <p>The comments.</p>
         * 
         * <strong>example:</strong>
         * <p>Confirm and Execute</p>
         */
        @NameInMap("comment")
        public String comment;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>select * from test</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The dynamic parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("dynamicParams")
        public String dynamicParams;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1719221186114</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the instance was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1719220182844</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <p>The KV parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("kvpairs")
        public String kvpairs;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relatedTemplateId")
        public Long relatedTemplateId;

        /**
         * <p>The static parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("staticParams")
        public String staticParams;

        /**
         * <p>The template parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("templateParams")
        public String templateParams;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Long version;

        public static UpdateSqlInstanceParamsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateSqlInstanceParamsResponseBodyResult self = new UpdateSqlInstanceParamsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateSqlInstanceParamsResponseBodyResult setCombineParams(String combineParams) {
            this.combineParams = combineParams;
            return this;
        }
        public String getCombineParams() {
            return this.combineParams;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setDynamicParams(String dynamicParams) {
            this.dynamicParams = dynamicParams;
            return this;
        }
        public String getDynamicParams() {
            return this.dynamicParams;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setKvpairs(String kvpairs) {
            this.kvpairs = kvpairs;
            return this;
        }
        public String getKvpairs() {
            return this.kvpairs;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setRelatedTemplateId(Long relatedTemplateId) {
            this.relatedTemplateId = relatedTemplateId;
            return this;
        }
        public Long getRelatedTemplateId() {
            return this.relatedTemplateId;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setStaticParams(String staticParams) {
            this.staticParams = staticParams;
            return this;
        }
        public String getStaticParams() {
            return this.staticParams;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setTemplateParams(String templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public String getTemplateParams() {
            return this.templateParams;
        }

        public UpdateSqlInstanceParamsResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
