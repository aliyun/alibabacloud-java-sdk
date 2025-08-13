// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class PocCreateTaskRequest extends TeaModel {
    /**
     * <p>Date format</p>
     * 
     * <strong>example:</strong>
     * <p>yyyyMMdd</p>
     */
    @NameInMap("DateFormat")
    public String dateFormat;

    /**
     * <p>Set the language type for request and response messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Region code.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Task name.</p>
     * 
     * <strong>example:</strong>
     * <p>o32d1pktx4t</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>Task token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>68ce949aff6be7f1201eb2f9095ac95f</p>
     */
    @NameInMap("Token")
    public String token;

    public static PocCreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PocCreateTaskRequest self = new PocCreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public PocCreateTaskRequest setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }
    public String getDateFormat() {
        return this.dateFormat;
    }

    public PocCreateTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PocCreateTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public PocCreateTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PocCreateTaskRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
