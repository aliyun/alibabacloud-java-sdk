// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QuerySupplementDetailResponseBody extends TeaModel {
    @NameInMap("OperateTime")
    public Long operateTime;

    @NameInMap("SerialNumber")
    public String serialNumber;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Type")
    public Integer type;

    @NameInMap("SbjDeadTime")
    public Long sbjDeadTime;

    @NameInMap("AcceptDeadTime")
    public Long acceptDeadTime;

    @NameInMap("SendTime")
    public Long sendTime;

    @NameInMap("AcceptTime")
    public Long acceptTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TmNumber")
    public String tmNumber;

    @NameInMap("UploadFileTemplateUrl")
    public String uploadFileTemplateUrl;

    @NameInMap("Content")
    public String content;

    @NameInMap("Id")
    public Long id;

    @NameInMap("FileTemplateUrls")
    public QuerySupplementDetailResponseBodyFileTemplateUrls fileTemplateUrls;

    public static QuerySupplementDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySupplementDetailResponseBody self = new QuerySupplementDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySupplementDetailResponseBody setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }
    public Long getOperateTime() {
        return this.operateTime;
    }

    public QuerySupplementDetailResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public QuerySupplementDetailResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public QuerySupplementDetailResponseBody setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public QuerySupplementDetailResponseBody setSbjDeadTime(Long sbjDeadTime) {
        this.sbjDeadTime = sbjDeadTime;
        return this;
    }
    public Long getSbjDeadTime() {
        return this.sbjDeadTime;
    }

    public QuerySupplementDetailResponseBody setAcceptDeadTime(Long acceptDeadTime) {
        this.acceptDeadTime = acceptDeadTime;
        return this;
    }
    public Long getAcceptDeadTime() {
        return this.acceptDeadTime;
    }

    public QuerySupplementDetailResponseBody setSendTime(Long sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public Long getSendTime() {
        return this.sendTime;
    }

    public QuerySupplementDetailResponseBody setAcceptTime(Long acceptTime) {
        this.acceptTime = acceptTime;
        return this;
    }
    public Long getAcceptTime() {
        return this.acceptTime;
    }

    public QuerySupplementDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySupplementDetailResponseBody setTmNumber(String tmNumber) {
        this.tmNumber = tmNumber;
        return this;
    }
    public String getTmNumber() {
        return this.tmNumber;
    }

    public QuerySupplementDetailResponseBody setUploadFileTemplateUrl(String uploadFileTemplateUrl) {
        this.uploadFileTemplateUrl = uploadFileTemplateUrl;
        return this;
    }
    public String getUploadFileTemplateUrl() {
        return this.uploadFileTemplateUrl;
    }

    public QuerySupplementDetailResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QuerySupplementDetailResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QuerySupplementDetailResponseBody setFileTemplateUrls(QuerySupplementDetailResponseBodyFileTemplateUrls fileTemplateUrls) {
        this.fileTemplateUrls = fileTemplateUrls;
        return this;
    }
    public QuerySupplementDetailResponseBodyFileTemplateUrls getFileTemplateUrls() {
        return this.fileTemplateUrls;
    }

    public static class QuerySupplementDetailResponseBodyFileTemplateUrls extends TeaModel {
        @NameInMap("FileTemplateUrls")
        public java.util.List<String> fileTemplateUrls;

        public static QuerySupplementDetailResponseBodyFileTemplateUrls build(java.util.Map<String, ?> map) throws Exception {
            QuerySupplementDetailResponseBodyFileTemplateUrls self = new QuerySupplementDetailResponseBodyFileTemplateUrls();
            return TeaModel.build(map, self);
        }

        public QuerySupplementDetailResponseBodyFileTemplateUrls setFileTemplateUrls(java.util.List<String> fileTemplateUrls) {
            this.fileTemplateUrls = fileTemplateUrls;
            return this;
        }
        public java.util.List<String> getFileTemplateUrls() {
            return this.fileTemplateUrls;
        }

    }

}
