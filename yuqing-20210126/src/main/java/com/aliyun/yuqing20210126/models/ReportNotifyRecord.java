// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class ReportNotifyRecord extends TeaModel {
    // 配置： 如图片宽度/接收人/抄送人等
    @NameInMap("conf")
    public String conf;

    // 自定义页面id
    @NameInMap("cpId")
    public Long cpId;

    // 创建时间，毫秒
    @NameInMap("gmtCreateTimestamp")
    public Long gmtCreateTimestamp;

    // 格式化的创建时间
    @NameInMap("gmtCreateFormat")
    public String gmtCreateFormat;

    // 修改时间，毫秒
    @NameInMap("gmtModifiedTimestamp")
    public Long gmtModifiedTimestamp;

    // 记录id
    @NameInMap("id")
    public Long id;

    // cpId对应的共享key，用于共享报告
    @NameInMap("shareKey")
    public String shareKey;

    // 主题
    @NameInMap("subject")
    public String subject;

    // 是否成功的标志，1表示成功，否则表示不成功
    @NameInMap("success")
    public Long success;

    // 类型： 如邮件、钉钉等
    @NameInMap("type")
    public Long type;

    // 创建人id
    @NameInMap("uidCreate")
    public String uidCreate;

    // 创建人名字
    @NameInMap("unameCreate")
    public String unameCreate;

    // 状态，1为生效，0为失效。
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

    public ReportNotifyRecord setGmtCreateTimestamp(Long gmtCreateTimestamp) {
        this.gmtCreateTimestamp = gmtCreateTimestamp;
        return this;
    }
    public Long getGmtCreateTimestamp() {
        return this.gmtCreateTimestamp;
    }

    public ReportNotifyRecord setGmtCreateFormat(String gmtCreateFormat) {
        this.gmtCreateFormat = gmtCreateFormat;
        return this;
    }
    public String getGmtCreateFormat() {
        return this.gmtCreateFormat;
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
