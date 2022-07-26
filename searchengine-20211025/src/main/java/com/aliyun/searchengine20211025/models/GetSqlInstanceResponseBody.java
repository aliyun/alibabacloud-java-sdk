// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetSqlInstanceResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetSqlInstanceResponseBodyResult result;

    public static GetSqlInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSqlInstanceResponseBody self = new GetSqlInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSqlInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSqlInstanceResponseBody setResult(GetSqlInstanceResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetSqlInstanceResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetSqlInstanceResponseBodyResult extends TeaModel {
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

        public static GetSqlInstanceResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetSqlInstanceResponseBodyResult self = new GetSqlInstanceResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetSqlInstanceResponseBodyResult setCombineParams(String combineParams) {
            this.combineParams = combineParams;
            return this;
        }
        public String getCombineParams() {
            return this.combineParams;
        }

        public GetSqlInstanceResponseBodyResult setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetSqlInstanceResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetSqlInstanceResponseBodyResult setDynamicParams(String dynamicParams) {
            this.dynamicParams = dynamicParams;
            return this;
        }
        public String getDynamicParams() {
            return this.dynamicParams;
        }

        public GetSqlInstanceResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetSqlInstanceResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetSqlInstanceResponseBodyResult setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public GetSqlInstanceResponseBodyResult setKvpairs(String kvpairs) {
            this.kvpairs = kvpairs;
            return this;
        }
        public String getKvpairs() {
            return this.kvpairs;
        }

        public GetSqlInstanceResponseBodyResult setRelatedTemplateId(Long relatedTemplateId) {
            this.relatedTemplateId = relatedTemplateId;
            return this;
        }
        public Long getRelatedTemplateId() {
            return this.relatedTemplateId;
        }

        public GetSqlInstanceResponseBodyResult setStaticParams(String staticParams) {
            this.staticParams = staticParams;
            return this;
        }
        public String getStaticParams() {
            return this.staticParams;
        }

        public GetSqlInstanceResponseBodyResult setTemplateParams(String templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public String getTemplateParams() {
            return this.templateParams;
        }

        public GetSqlInstanceResponseBodyResult setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
