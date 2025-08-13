// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class StopSimulationTaskRequest extends TeaModel {
    /**
     * <p>Sets the language type for requests and received messages, default value is <strong>zh</strong>. Values:</p>
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
     * <p>Task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>376773</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <p>Region code</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static StopSimulationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSimulationTaskRequest self = new StopSimulationTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopSimulationTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public StopSimulationTaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public StopSimulationTaskRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
