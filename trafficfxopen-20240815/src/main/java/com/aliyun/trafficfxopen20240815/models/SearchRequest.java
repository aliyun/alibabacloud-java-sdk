// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trafficfxopen20240815.models;

import com.aliyun.tea.*;

public class SearchRequest extends TeaModel {
    @NameInMap("scene")
    public String scene;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;cabinClass&quot;: &quot;ALL_CABIN&quot;,
     *   &quot;passengerTypeQuantity&quot;: {
     *     &quot;ADT&quot;: 1,
     *     &quot;INFANT&quot;: 0,
     *     &quot;CHD&quot;: 0
     *   },
     *   &quot;searchMode&quot;: 0,
     *   &quot;searchOdInfoList&quot;: [
     *     {
     *       &quot;arrCityCode&quot;: &quot;BJS&quot;,
     *       &quot;depCityCode&quot;: &quot;JNG&quot;,
     *       &quot;depDate&quot;: &quot;2024-08-14 00:00:00&quot;
     *     }
     *   ],
     *   &quot;searchSource&quot;: &quot;gd&quot;,
     *   &quot;tripType&quot;: 1
     * }</p>
     */
    @NameInMap("searchParam")
    public String searchParam;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>“1”</p>
     */
    @NameInMap("source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>“1”</p>
     */
    @NameInMap("terminal")
    public String terminal;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>“121343”</p>
     */
    @NameInMap("userId")
    public String userId;

    public static SearchRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchRequest self = new SearchRequest();
        return TeaModel.build(map, self);
    }

    public SearchRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public SearchRequest setSearchParam(String searchParam) {
        this.searchParam = searchParam;
        return this;
    }
    public String getSearchParam() {
        return this.searchParam;
    }

    public SearchRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SearchRequest setTerminal(String terminal) {
        this.terminal = terminal;
        return this;
    }
    public String getTerminal() {
        return this.terminal;
    }

    public SearchRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
