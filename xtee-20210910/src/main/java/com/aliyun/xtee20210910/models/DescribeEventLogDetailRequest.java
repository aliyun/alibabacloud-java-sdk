// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventLogDetailRequest extends TeaModel {
    /**
     * <p>Set the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    /**
     * <p>Log details.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BD6B08EC-1B44-5378-8838-C76A36415C55</p>
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
