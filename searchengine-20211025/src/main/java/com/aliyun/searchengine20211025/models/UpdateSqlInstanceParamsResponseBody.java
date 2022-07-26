// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class UpdateSqlInstanceParamsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("combineParams")
        public String combineParams;

        @NameInMap("comment")
        public String comment;

        @NameInMap("content")
        public String content;

        @NameInMap("dynamicParams")
        public String dynamicParams;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModified")
        public String gmtModified;

        @NameInMap("instanceId")
        public Long instanceId;

        @NameInMap("kvpairs")
        public String kvpairs;

        @NameInMap("relatedTemplateId")
        public Long relatedTemplateId;

        @NameInMap("staticParams")
        public String staticParams;

        @NameInMap("templateParams")
        public String templateParams;

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
