// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiplugin20210325.models;

import com.aliyun.tea.*;

public class CreateScheduleRequest extends TeaModel {
    // 数据源地址
    // - 0: project/table
    // MaxCompute项目名和表名，使用前需要授权
    // - 1: oss地址 https://bucket.endpoint/path/to/file
    // OSS地址，必须以https开头，使用前需要授权，如 https://bucket.endpoint/path/to/file
    @NameInMap("DataAddress")
    public String dataAddress;

    // 数据源类型
    // - 0: MaxCompute
    // - 1: CSV
    // 数据源类型为CSV时，可以提供不带header的CSV文件或带header的CSV文件
    // 不带header的CSV文件每行为一个手机号
    // 使用带header的CSV文件，如果不指定手机号列名，默认使用第一列为手机号
    // 其他列可用于替换模板中的形如${variable}的变量，实现个性化发送
    @NameInMap("DataSource")
    public Integer dataSource;

    // 钉钉机器人关键词
    @NameInMap("DingBotKeyword")
    public String dingBotKeyword;

    // 钉钉机器人token
    @NameInMap("DingBotToken")
    public String dingBotToken;

    // 发送计划名称
    @NameInMap("Name")
    public String name;

    // 分区表达式
    @NameInMap("Partition")
    public String partition;

    // 手机号列名
    @NameInMap("PhoneNumberColumn")
    public String phoneNumberColumn;

    // 发布时间 (UTC+8)，建议距现在10分钟后，不能距现在超过一年，否则会发生回绕，格式必须是2020-01-01 12:00:00
    @NameInMap("SendTime")
    public String sendTime;

    // 签名ID
    @NameInMap("SignatureID")
    public String signatureID;

    // 模板号列名(可选)
    @NameInMap("TemplateCodeColumn")
    public String templateCodeColumn;

    // 模板ID
    @NameInMap("TemplateID")
    public String templateID;

    public static CreateScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduleRequest self = new CreateScheduleRequest();
        return TeaModel.build(map, self);
    }

    public CreateScheduleRequest setDataAddress(String dataAddress) {
        this.dataAddress = dataAddress;
        return this;
    }
    public String getDataAddress() {
        return this.dataAddress;
    }

    public CreateScheduleRequest setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public Integer getDataSource() {
        return this.dataSource;
    }

    public CreateScheduleRequest setDingBotKeyword(String dingBotKeyword) {
        this.dingBotKeyword = dingBotKeyword;
        return this;
    }
    public String getDingBotKeyword() {
        return this.dingBotKeyword;
    }

    public CreateScheduleRequest setDingBotToken(String dingBotToken) {
        this.dingBotToken = dingBotToken;
        return this;
    }
    public String getDingBotToken() {
        return this.dingBotToken;
    }

    public CreateScheduleRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateScheduleRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public CreateScheduleRequest setPhoneNumberColumn(String phoneNumberColumn) {
        this.phoneNumberColumn = phoneNumberColumn;
        return this;
    }
    public String getPhoneNumberColumn() {
        return this.phoneNumberColumn;
    }

    public CreateScheduleRequest setSendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }
    public String getSendTime() {
        return this.sendTime;
    }

    public CreateScheduleRequest setSignatureID(String signatureID) {
        this.signatureID = signatureID;
        return this;
    }
    public String getSignatureID() {
        return this.signatureID;
    }

    public CreateScheduleRequest setTemplateCodeColumn(String templateCodeColumn) {
        this.templateCodeColumn = templateCodeColumn;
        return this;
    }
    public String getTemplateCodeColumn() {
        return this.templateCodeColumn;
    }

    public CreateScheduleRequest setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
