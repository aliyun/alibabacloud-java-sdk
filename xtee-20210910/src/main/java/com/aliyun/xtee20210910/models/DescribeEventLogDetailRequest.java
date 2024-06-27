// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventLogDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("regId")
    public String regId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("reqIdByLog")
    public String reqIdByLog;

    public static DescribeEventLogDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogDetailRequest self = new DescribeEventLogDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventLogDetailRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public DescribeEventLogDetailRequest setReqIdByLog(String reqIdByLog) {
        this.reqIdByLog = reqIdByLog;
        return this;
    }
    public String getReqIdByLog() {
        return this.reqIdByLog;
    }

}
