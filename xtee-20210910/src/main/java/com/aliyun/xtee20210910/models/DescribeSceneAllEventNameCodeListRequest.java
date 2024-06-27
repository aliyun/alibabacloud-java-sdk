// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSceneAllEventNameCodeListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("createType")
    public String createType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeSceneAllEventNameCodeListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSceneAllEventNameCodeListRequest self = new DescribeSceneAllEventNameCodeListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSceneAllEventNameCodeListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeSceneAllEventNameCodeListRequest setCreateType(String createType) {
        this.createType = createType;
        return this;
    }
    public String getCreateType() {
        return this.createType;
    }

    public DescribeSceneAllEventNameCodeListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
