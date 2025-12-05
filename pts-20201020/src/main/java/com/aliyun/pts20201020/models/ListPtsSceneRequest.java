// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020.models;

import com.aliyun.tea.*;

public class ListPtsSceneRequest extends TeaModel {
    /**
     * <p>The keyword based on which you can search for the PTS scenario. You can perform a fuzzy search on the scenario name (<strong>SceneName</strong>) or an exact search on the scenario ID (<strong>SceneId</strong>).</p>
     */
    @NameInMap("KeyWord")
    public String keyWord;

    /**
     * <p>The number of the page to return. Valid values: 1 to 1073741824.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of scenario entries to return per page. Valid values: 10 to 1000.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListPtsSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPtsSceneRequest self = new ListPtsSceneRequest();
        return TeaModel.build(map, self);
    }

    public ListPtsSceneRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListPtsSceneRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPtsSceneRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
