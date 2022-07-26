// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddHotspotFileRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    @NameInMap("SceneId")
    public String sceneId;

    @NameInMap("Type")
    public String type;

    public static AddHotspotFileRequest build(java.util.Map<String, ?> map) throws Exception {
        AddHotspotFileRequest self = new AddHotspotFileRequest();
        return TeaModel.build(map, self);
    }

    public AddHotspotFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AddHotspotFileRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public AddHotspotFileRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
