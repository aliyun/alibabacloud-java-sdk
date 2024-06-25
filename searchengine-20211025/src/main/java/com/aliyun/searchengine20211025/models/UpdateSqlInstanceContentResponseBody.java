// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceContentResponseBody extends TeaModel {
    /**
     * <p>id of request</p>
     * 
     * <strong>example:</strong>
     * <p>E45380E8-994A-5402-9806-F114B3295FCF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>InstanceVersionVO</p>
     */
    @NameInMap("result")
    public UpdateSqlInstanceContentResponseBodyResult result;

    public static UpdateSqlInstanceContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSqlInstanceContentResponseBody self = new UpdateSqlInstanceContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSqlInstanceContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSqlInstanceContentResponseBody setResult(UpdateSqlInstanceContentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateSqlInstanceContentResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateSqlInstanceContentResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("combineParams")
        public String combineParams;

        @NameInMap("comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>select * from test</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("dynamicParams")
        public String dynamicParams;

        /**
         * <strong>example:</strong>
         * <p>1719221186114</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1719221186114</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("instanceId")
        public Long instanceId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("kvpairs")
        public String kvpairs;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relatedTemplateId")
        public Long relatedTemplateId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("staticParams")
        public String staticParams;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;trace\&quot;:\&quot;INFO\&quot;,\&quot;databaseName\&quot;:\&quot;general\&quot;,\&quot;iquan.plan.cache.enable\&quot;:true,\&quot;iquan.plan.prepare.level\&quot;:\&quot;jni.post.optimize\&quot;,\&quot;urlencode_data\&quot;:false,\&quot;formatType\&quot;:\&quot;string\&quot;,\&quot;timeout\&quot;:1000}</p>
         */
        @NameInMap("templateParams")
        public String templateParams;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("version")
        public Long version;

        public static UpdateSqlInstanceContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateSqlInstanceContentResponseBodyResult self = new UpdateSqlInstanceContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateSqlInstanceContentResponseBodyResult setCombineParams(String combineParams) {
            this.combineParams = combineParams;
            return this;
        }
        public String getCombineParams() {
            return this.combineParams;
        }

        public UpdateSqlInstanceContentResponseBodyResult setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public UpdateSqlInstanceContentResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateSqlInstanceContentResponseBodyResult setDynamicParams(String dynamicParams) {
            this.dynamicParams = dynamicParams;
            return this;
        }
        public String getDynamicParams() {
            return this.dynamicParams;
        }

        public UpdateSqlInstanceContentResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateSqlInstanceContentResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UpdateSqlInstanceContentResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public UpdateSqlInstanceContentResponseBodyResult setKvpairs(String kvpairs) {
            this.kvpairs = kvpairs;
            return this;
        }
        public String getKvpairs() {
            return this.kvpairs;
        }

        public UpdateSqlInstanceContentResponseBodyResult setRelatedTemplateId(Long relatedTemplateId) {
            this.relatedTemplateId = relatedTemplateId;
            return this;
        }
        public Long getRelatedTemplateId() {
            return this.relatedTemplateId;
        }

        public UpdateSqlInstanceContentResponseBodyResult setStaticParams(String staticParams) {
            this.staticParams = staticParams;
            return this;
        }
        public String getStaticParams() {
            return this.staticParams;
        }

        public UpdateSqlInstanceContentResponseBodyResult setTemplateParams(String templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public String getTemplateParams() {
            return this.templateParams;
        }

        public UpdateSqlInstanceContentResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
