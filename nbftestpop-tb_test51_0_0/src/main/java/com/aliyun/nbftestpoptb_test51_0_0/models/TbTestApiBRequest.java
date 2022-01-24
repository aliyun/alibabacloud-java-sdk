// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpoptb_test51_0_0.models;

import com.aliyun.tea.*;

public class TbTestApiBRequest extends TeaModel {
    @NameInMap("dto")
    public TbTestApiBRequestDto dto;

    @NameInMap("id")
    public Integer id;

    public static TbTestApiBRequest build(java.util.Map<String, ?> map) throws Exception {
        TbTestApiBRequest self = new TbTestApiBRequest();
        return TeaModel.build(map, self);
    }

    public TbTestApiBRequest setDto(TbTestApiBRequestDto dto) {
        this.dto = dto;
        return this;
    }
    public TbTestApiBRequestDto getDto() {
        return this.dto;
    }

    public TbTestApiBRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public static class TbTestApiBRequestDto extends TeaModel {
        @NameInMap("big")
        public Float big;

        @NameInMap("date")
        public Long date;

        @NameInMap("dou")
        public Float dou;

        @NameInMap("test")
        public String test;

        public static TbTestApiBRequestDto build(java.util.Map<String, ?> map) throws Exception {
            TbTestApiBRequestDto self = new TbTestApiBRequestDto();
            return TeaModel.build(map, self);
        }

        public TbTestApiBRequestDto setBig(Float big) {
            this.big = big;
            return this;
        }
        public Float getBig() {
            return this.big;
        }

        public TbTestApiBRequestDto setDate(Long date) {
            this.date = date;
            return this;
        }
        public Long getDate() {
            return this.date;
        }

        public TbTestApiBRequestDto setDou(Float dou) {
            this.dou = dou;
            return this;
        }
        public Float getDou() {
            return this.dou;
        }

        public TbTestApiBRequestDto setTest(String test) {
            this.test = test;
            return this;
        }
        public String getTest() {
            return this.test;
        }

    }

}
