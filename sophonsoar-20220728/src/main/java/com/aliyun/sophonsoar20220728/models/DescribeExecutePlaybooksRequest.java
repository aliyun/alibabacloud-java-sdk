// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribeExecutePlaybooksRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("ParamType")
    public String paramType;

    @NameInMap("PlaybookName")
    public String playbookName;

    @NameInMap("Uuid")
    public String uuid;

    public static DescribeExecutePlaybooksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExecutePlaybooksRequest self = new DescribeExecutePlaybooksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExecutePlaybooksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeExecutePlaybooksRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public DescribeExecutePlaybooksRequest setPlaybookName(String playbookName) {
        this.playbookName = playbookName;
        return this;
    }
    public String getPlaybookName() {
        return this.playbookName;
    }

    public DescribeExecutePlaybooksRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
