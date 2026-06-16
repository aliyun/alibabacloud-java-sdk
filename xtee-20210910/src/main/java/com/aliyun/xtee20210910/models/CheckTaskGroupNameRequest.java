// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CheckTaskGroupNameRequest extends TeaModel {
    /**
     * <p>Language of error messages returned by the API. Valid values: zh: Chinese, en: English. Default value: en.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Area encoding.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegId")
    public String regId;

    /**
     * <p>Task group name.</p>
     * 
     * <strong>example:</strong>
     * <p>GroupNameTest</p>
     */
    @NameInMap("TaskGroupName")
    public String taskGroupName;

    public static CheckTaskGroupNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTaskGroupNameRequest self = new CheckTaskGroupNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckTaskGroupNameRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckTaskGroupNameRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

    public CheckTaskGroupNameRequest setTaskGroupName(String taskGroupName) {
        this.taskGroupName = taskGroupName;
        return this;
    }
    public String getTaskGroupName() {
        return this.taskGroupName;
    }

}
