// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810.models;

import com.aliyun.tea.*;

public class ListScenesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Scenes")
    @Validation(required = true)
    public java.util.List<ListScenesResponseScenes> scenes;

    public static ListScenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScenesResponse self = new ListScenesResponse();
        return TeaModel.build(map, self);
    }

    public static class ListScenesResponseScenes extends TeaModel {
        @NameInMap("SceneId")
        @Validation(required = true)
        public String sceneId;

        @NameInMap("SceneName")
        @Validation(required = true)
        public String sceneName;

        @NameInMap("Duration")
        @Validation(required = true)
        public Integer duration;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("SceneType")
        @Validation(required = true)
        public String sceneType;

        @NameInMap("Cronable")
        @Validation(required = true)
        public Boolean cronable;

        @NameInMap("ExecStatus")
        @Validation(required = true)
        public String execStatus;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("AllsparkId")
        @Validation(required = true)
        public String allsparkId;

        @NameInMap("AgentPool")
        @Validation(required = true)
        public String agentPool;

        public static ListScenesResponseScenes build(java.util.Map<String, ?> map) throws Exception {
            ListScenesResponseScenes self = new ListScenesResponseScenes();
            return TeaModel.build(map, self);
        }

    }

}
