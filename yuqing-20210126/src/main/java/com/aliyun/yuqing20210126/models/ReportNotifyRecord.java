// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ReportNotifyRecord extends TeaModel {
    @NameInMap("conf")
    public String conf;

    @NameInMap("cpId")
    public Long cpId;

    @NameInMap("gmtCreateFormat")
    public String gmtCreateFormat;

    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    @NameInMap("id")
    public Long id;

    @NameInMap("shareKey")
    public String shareKey;

    @NameInMap("subject")
    public String subject;

    @NameInMap("success")
    public Long success;

    @NameInMap("type")
    public Long type;

    @NameInMap("uidCreate")
    public String uidCreate;

    @NameInMap("unameCreate")
    public String unameCreate;

    @NameInMap("valid")
    public Long valid;

    public static ReportNotifyRecord build(java.util.Map<String, ?> map) throws Exception {
        ReportNotifyRecord self = new ReportNotifyRecord();
        return TeaModel.build(map, self);
    }

    public ReportNotifyRecord setConf(String conf) {
        this.conf = conf;
        return this;
    }
    public String getConf() {
        return this.conf;
    }

    public ReportNotifyRecord setCpId(Long cpId) {
        this.cpId = cpId;
        return this;
    }
    public Long getCpId() {
        return this.cpId;
    }

    public ReportNotifyRecord setGmtCreateFormat(String gmtCreateFormat) {
        this.gmtCreateFormat = gmtCreateFormat;
        return this;
    }
    public String getGmtCreateFormat() {
        return this.gmtCreateFormat;
    }

    public ReportNotifyRecord setGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
        return this;
    }
    public Long getGmtCreateTimestamp() {
        return this.gmtCreateTimestamp;
    }

    public ReportNotifyRecord setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
        this.gmtModifiedTimestamp = gmtModifiedTimestamp;
        return this;
    }
    public Long getGmtModifiedTimestamp() {
        return this.gmtModifiedTimestamp;
    }

    public ReportNotifyRecord setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ReportNotifyRecord setShareKey(String shareKey) {
        this.shareKey = shareKey;
        return this;
    }
    public String getShareKey() {
        return this.shareKey;
    }

    public ReportNotifyRecord setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public ReportNotifyRecord setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public ReportNotifyRecord setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public ReportNotifyRecord setUidCreate(String uidCreate) {
        this.uidCreate = uidCreate;
        return this;
    }
    public String getUidCreate() {
        return this.uidCreate;
    }

    public ReportNotifyRecord setUnameCreate(String unameCreate) {
        this.unameCreate = unameCreate;
        return this;
    }
    public String getUnameCreate() {
        return this.unameCreate;
    }

    public ReportNotifyRecord setValid(Long valid) {
        this.valid = valid;
        return this;
    }
    public Long getValid() {
        return this.valid;
    }

}
