// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class TaskNameByUserIdRequest extends TeaModel {
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
     * <p>Methylation_node_5_3</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static TaskNameByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        TaskNameByUserIdRequest self = new TaskNameByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public TaskNameByUserIdRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TaskNameByUserIdRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public TaskNameByUserIdRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
