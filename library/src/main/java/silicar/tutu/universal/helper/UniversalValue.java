package silicar.tutu.universal.helper;

import silicar.tutu.universal.helper.base.BaseModel;

/**
 * 参数信息
 * Created by Brady on 2016/5/2.
 */
public class UniversalValue {
    public float value;
    public BaseModel model;
    public float measureValue;

    public UniversalValue() {
    }

    public UniversalValue(float value, BaseModel model) {
        this.value = value;
        this.model = model;
    }

    public float getMeasureValue() {
        measureValue = value * model.getBaseValue();
        return measureValue;
    }
}
